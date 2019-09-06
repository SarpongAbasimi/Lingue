class Diary
  attr_reader :entries

  def initialize()
    @entries = []
  end

  def add(title, body)
    @entries << {title: title, body: body}
  end
end