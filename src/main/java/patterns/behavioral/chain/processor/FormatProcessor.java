package patterns.behavioral.chain.processor;

import patterns.behavioral.chain.model.SomeObject;

public class FormatProcessor extends Processor {

    private final int maxInfoLength;

    public FormatProcessor(int maxInfoLength) {
        this.maxInfoLength = maxInfoLength;
    }

    @Override
    public void process(SomeObject someObject) {
        String formattedInfo = formatInfo(someObject.getInfo());
        someObject.setInfo(formattedInfo);
    }

    private String formatInfo(String info) {
        if (info.length() > maxInfoLength) {
            info = info.substring(0, maxInfoLength);
        }
        return info;
    }
}
