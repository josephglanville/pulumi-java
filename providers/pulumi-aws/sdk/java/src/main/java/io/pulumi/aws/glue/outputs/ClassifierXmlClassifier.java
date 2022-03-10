// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ClassifierXmlClassifier {
    /**
     * An identifier of the data format that the classifier matches.
     * 
     */
    private final String classification;
    /**
     * The XML tag designating the element that contains each record in an XML document being parsed. Note that this cannot identify a self-closing element (closed by `/>`). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, `<row item_a="A" item_b="B"></row>` is okay, but `<row item_a="A" item_b="B" />` is not).
     * 
     */
    private final String rowTag;

    @OutputCustomType.Constructor
    private ClassifierXmlClassifier(
        @OutputCustomType.Parameter("classification") String classification,
        @OutputCustomType.Parameter("rowTag") String rowTag) {
        this.classification = classification;
        this.rowTag = rowTag;
    }

    /**
     * An identifier of the data format that the classifier matches.
     * 
    */
    public String getClassification() {
        return this.classification;
    }
    /**
     * The XML tag designating the element that contains each record in an XML document being parsed. Note that this cannot identify a self-closing element (closed by `/>`). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, `<row item_a="A" item_b="B"></row>` is okay, but `<row item_a="A" item_b="B" />` is not).
     * 
    */
    public String getRowTag() {
        return this.rowTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassifierXmlClassifier defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String classification;
        private String rowTag;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassifierXmlClassifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.rowTag = defaults.rowTag;
        }

        public Builder setClassification(String classification) {
            this.classification = Objects.requireNonNull(classification);
            return this;
        }

        public Builder setRowTag(String rowTag) {
            this.rowTag = Objects.requireNonNull(rowTag);
            return this;
        }
        public ClassifierXmlClassifier build() {
            return new ClassifierXmlClassifier(classification, rowTag);
        }
    }
}
