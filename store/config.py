class Configurations(object):
  DEBUG=False

class Development(Configurations):
  DEBUG=True

config = {
  'development': Development
}