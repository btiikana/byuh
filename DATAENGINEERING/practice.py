# Analyzing Log Files
from datetime import datetime

logs = [
(1, "2025-03-01 08:15:23", "login", 120),
(2, "2025-03-01 08:16:01", "logout", 80),
(3, "2025-03-01 08:17:10", "login", 150),
(1, "2025-03-01 08:18:45", "browse", 300),
(4, "2025-03-01 08:20:05", "login", 130),
(2, "2025-03-01 08:22:50", "browse", 180),
(3, "2025-03-01 08:25:12", "login", 110)
]

def parseLog(logEntry):
    parts = logEntry.split(",")
    userId = int(parts[0])
    timestamp = parts[1].strip('"')
    action = parts[2].strip('"')
    responseTime = int(parts[3])
    return (userId, timestamp, action, responseTime)

def calculateAverageResponseTime(logs):
    actions = {}
    for log in logs:
        actionType = log[2]
        responseTime = log[3]
        if actionType not in actions:
            actions[actionType] = []
        actions[actionType].append(responseTime)

    averages = {}
    for actionType, times in actions.items():
        averages[actionType] = sum(times) / len(times)
    return averages

def topUsersByResponseTime(logs):
    userTimes = []
    for log in logs:
        userId = log[0]
        responseTime = log[3]
        found = False
        for user in userTimes:
            if user[0] == userId:
                user[1] += responseTime
                found = True
                break
        if not found:
            userTimes.append([userId, responseTime])

    userTimes.sort(key=lambda x: x[1], reverse=True)
    return userTimes[:3]

def find_inactive_users(logs):
    # Find inactive users (who haven’t acted in 30 minutes)
    user_last_action = {}
    for log in logs:
        userId = log[0]
        timestamp = log[1]
        timestamp = datetime.strptime(timestamp, "%Y-%m-%d %H:%M:%S")
        if userId not in user_last_action or timestamp > user_last_action[userId]:
            user_last_action[userId] = timestamp
    
    inactive_users = []
    for userId, last_action in user_last_action.items():
        time_diff = datetime.now() - last_action
        if time_diff.total_seconds() > 1800:
            inactive_users.append(userId)
    
    return inactive_users

def sort_logs_by_timestamp(logs):
    # Sort logs by timestamp
    return sorted(logs, key=lambda x: x[1])

# Step 3: Call and test your functions
print("Average Response Times:", calculateAverageResponseTime(logs))
print("Top 3 Users by Response Time:", topUsersByResponseTime(logs))
print("Inactive Users:", find_inactive_users(logs))
sorted_logs = sort_logs_by_timestamp(logs)
print("Sorted Logs:", sorted_logs)