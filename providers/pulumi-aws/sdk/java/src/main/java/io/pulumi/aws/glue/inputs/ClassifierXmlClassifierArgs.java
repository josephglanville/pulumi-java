// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClassifierXmlClassifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassifierXmlClassifierArgs Empty = new ClassifierXmlClassifierArgs();

    /**
     * An identifier of the data format that the classifier matches.
     * 
     */
    @Import(name="classification", required=true)
      private final Output<String> classification;

    public Output<String> getClassification() {
        return this.classification;
    }

    /**
     * The XML tag designating the element that contains each record in an XML document being parsed. Note that this cannot identify a self-closing element (closed by `/>`). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, `<row item_a="A" item_b="B"></row>` is okay, but `<row item_a="A" item_b="B" />` is not).
     * 
     */
    @Import(name="rowTag", required=true)
      private final Output<String> rowTag;

    public Output<String> getRowTag() {
        return this.rowTag;
    }

    public ClassifierXmlClassifierArgs(
        Output<String> classification,
        Output<String> rowTag) {
        this.classification = Objects.requireNonNull(classification, "expected parameter 'classification' to be non-null");
        this.rowTag = Objects.requireNonNull(rowTag, "expected parameter 'rowTag' to be non-null");
    }

    private ClassifierXmlClassifierArgs() {
        this.classification = Output.empty();
        this.rowTag = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassifierXmlClassifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> classification;
        private Output<String> rowTag;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassifierXmlClassifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.rowTag = defaults.rowTag;
        }

        public Builder classification(Output<String> classification) {
            this.classification = Objects.requireNonNull(classification);
            return this;
        }
        public Builder classification(String classification) {
            this.classification = Output.of(Objects.requireNonNull(classification));
            return this;
        }
        public Builder rowTag(Output<String> rowTag) {
            this.rowTag = Objects.requireNonNull(rowTag);
            return this;
        }
        public Builder rowTag(String rowTag) {
            this.rowTag = Output.of(Objects.requireNonNull(rowTag));
            return this;
        }        public ClassifierXmlClassifierArgs build() {
            return new ClassifierXmlClassifierArgs(classification, rowTag);
        }
    }
}