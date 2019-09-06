require "diary"

RSpec.describe Diary do
  let(:diary){ described_class.new }

  describe '#initialize' do
    it "has zero entries" do
      expect(diary.entries).to eq []
    end
  end

  describe "#add_entries" do
    it "allows users to add to entries" do 
      diary.add("Day one", "I had pizza with my mates")
      first_entry = diary.entries.first
      expect(first_entry[:title]).to eq('Day one')
    end
  end
end
