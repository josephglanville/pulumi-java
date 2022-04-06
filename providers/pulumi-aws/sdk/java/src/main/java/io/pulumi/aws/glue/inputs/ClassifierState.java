// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.ClassifierCsvClassifierGetArgs;
import io.pulumi.aws.glue.inputs.ClassifierGrokClassifierGetArgs;
import io.pulumi.aws.glue.inputs.ClassifierJsonClassifierGetArgs;
import io.pulumi.aws.glue.inputs.ClassifierXmlClassifierGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassifierState extends io.pulumi.resources.ResourceArgs {

    public static final ClassifierState Empty = new ClassifierState();

    /**
     * A classifier for Csv content. Defined below.
     * 
     */
    @Import(name="csvClassifier")
      private final @Nullable Output<ClassifierCsvClassifierGetArgs> csvClassifier;

    public Output<ClassifierCsvClassifierGetArgs> getCsvClassifier() {
        return this.csvClassifier == null ? Output.empty() : this.csvClassifier;
    }

    /**
     * A classifier that uses grok patterns. Defined below.
     * 
     */
    @Import(name="grokClassifier")
      private final @Nullable Output<ClassifierGrokClassifierGetArgs> grokClassifier;

    public Output<ClassifierGrokClassifierGetArgs> getGrokClassifier() {
        return this.grokClassifier == null ? Output.empty() : this.grokClassifier;
    }

    /**
     * A classifier for JSON content. Defined below.
     * 
     */
    @Import(name="jsonClassifier")
      private final @Nullable Output<ClassifierJsonClassifierGetArgs> jsonClassifier;

    public Output<ClassifierJsonClassifierGetArgs> getJsonClassifier() {
        return this.jsonClassifier == null ? Output.empty() : this.jsonClassifier;
    }

    /**
     * The name of the classifier.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A classifier for XML content. Defined below.
     * 
     */
    @Import(name="xmlClassifier")
      private final @Nullable Output<ClassifierXmlClassifierGetArgs> xmlClassifier;

    public Output<ClassifierXmlClassifierGetArgs> getXmlClassifier() {
        return this.xmlClassifier == null ? Output.empty() : this.xmlClassifier;
    }

    public ClassifierState(
        @Nullable Output<ClassifierCsvClassifierGetArgs> csvClassifier,
        @Nullable Output<ClassifierGrokClassifierGetArgs> grokClassifier,
        @Nullable Output<ClassifierJsonClassifierGetArgs> jsonClassifier,
        @Nullable Output<String> name,
        @Nullable Output<ClassifierXmlClassifierGetArgs> xmlClassifier) {
        this.csvClassifier = csvClassifier;
        this.grokClassifier = grokClassifier;
        this.jsonClassifier = jsonClassifier;
        this.name = name;
        this.xmlClassifier = xmlClassifier;
    }

    private ClassifierState() {
        this.csvClassifier = Output.empty();
        this.grokClassifier = Output.empty();
        this.jsonClassifier = Output.empty();
        this.name = Output.empty();
        this.xmlClassifier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassifierState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClassifierCsvClassifierGetArgs> csvClassifier;
        private @Nullable Output<ClassifierGrokClassifierGetArgs> grokClassifier;
        private @Nullable Output<ClassifierJsonClassifierGetArgs> jsonClassifier;
        private @Nullable Output<String> name;
        private @Nullable Output<ClassifierXmlClassifierGetArgs> xmlClassifier;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassifierState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csvClassifier = defaults.csvClassifier;
    	      this.grokClassifier = defaults.grokClassifier;
    	      this.jsonClassifier = defaults.jsonClassifier;
    	      this.name = defaults.name;
    	      this.xmlClassifier = defaults.xmlClassifier;
        }

        public Builder csvClassifier(@Nullable Output<ClassifierCsvClassifierGetArgs> csvClassifier) {
            this.csvClassifier = csvClassifier;
            return this;
        }
        public Builder csvClassifier(@Nullable ClassifierCsvClassifierGetArgs csvClassifier) {
            this.csvClassifier = Output.ofNullable(csvClassifier);
            return this;
        }
        public Builder grokClassifier(@Nullable Output<ClassifierGrokClassifierGetArgs> grokClassifier) {
            this.grokClassifier = grokClassifier;
            return this;
        }
        public Builder grokClassifier(@Nullable ClassifierGrokClassifierGetArgs grokClassifier) {
            this.grokClassifier = Output.ofNullable(grokClassifier);
            return this;
        }
        public Builder jsonClassifier(@Nullable Output<ClassifierJsonClassifierGetArgs> jsonClassifier) {
            this.jsonClassifier = jsonClassifier;
            return this;
        }
        public Builder jsonClassifier(@Nullable ClassifierJsonClassifierGetArgs jsonClassifier) {
            this.jsonClassifier = Output.ofNullable(jsonClassifier);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder xmlClassifier(@Nullable Output<ClassifierXmlClassifierGetArgs> xmlClassifier) {
            this.xmlClassifier = xmlClassifier;
            return this;
        }
        public Builder xmlClassifier(@Nullable ClassifierXmlClassifierGetArgs xmlClassifier) {
            this.xmlClassifier = Output.ofNullable(xmlClassifier);
            return this;
        }        public ClassifierState build() {
            return new ClassifierState(csvClassifier, grokClassifier, jsonClassifier, name, xmlClassifier);
        }
    }
}