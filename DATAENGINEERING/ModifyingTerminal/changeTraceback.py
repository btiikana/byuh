# import traceback
# import sys
# import os

# def custom_excepthook(exc_type, exc_value, exc_tb):
#     tb_lines = traceback.format_exception(exc_type, exc_value, exc_tb)
#     for line in tb_lines:
#         # Replace full file paths with your custom path
#         if "File" in line:
#             line = line.replace("C:/Users/btiik/Desktop/CS101/", "📁 CS101/")
#         print(line, end='')

# # Override the default exception handler
# sys.excepthook = custom_excepthook

# # Example error
# def divide_by_zero():
#     return 1 / 0

# divide_by_zero()

from rich.traceback import install
install(show_locals=True, suppress=[r'C:\\Users\\btiik\\'])

# Example error
def oops():
    return 1 / 0

oops()
