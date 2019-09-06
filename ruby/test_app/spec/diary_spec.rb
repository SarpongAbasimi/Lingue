require "diary"

RSpec.describe Diary do
  let(:diary){ described_class.new }

  describe "#add_entries" do
    it "allows users to add to entries" do 
      diary.add("Day one", "I had pizza with my mates")
      first_entry = diary.entries.first
      expect(first_entry[:title]).to eq('Day one')
      expect(first_entry).to eq({title: 'Day one', body: 'I had pizza with my mates'})
    end
  end
end
