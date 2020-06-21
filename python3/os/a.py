import os 



home = os.environ.get('HOME')
dowloads = os.path.join(home, 'Downloads')

print(dowloads)

print(os.listdir(dowloads))
# for i in os.listdir(home):
#   print(i)