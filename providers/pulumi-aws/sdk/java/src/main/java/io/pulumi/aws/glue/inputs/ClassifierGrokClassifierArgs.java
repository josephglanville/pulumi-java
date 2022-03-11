// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassifierGrokClassifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClassifierGrokClassifierArgs Empty = new ClassifierGrokClassifierArgs();

    /**
     * An identifier of the data format that the classifier matches.
     * 
     */
    @InputImport(name="classification", required=true)
      private final Output<String> classification;

    public Output<String> getClassification() {
        return this.classification;
    }

    /**
     * Custom grok patterns used by this classifier.
     * 
     */
    @InputImport(name="customPatterns")
      private final @Nullable Output<String> customPatterns;

    public Output<String> getCustomPatterns() {
        return this.customPatterns == null ? Output.empty() : this.customPatterns;
    }

    /**
     * The grok pattern used by this classifier.
     * 
     */
    @InputImport(name="grokPattern", required=true)
      private final Output<String> grokPattern;

    public Output<String> getGrokPattern() {
        return this.grokPattern;
    }

    public ClassifierGrokClassifierArgs(
        Output<String> classification,
        @Nullable Output<String> customPatterns,
        Output<String> grokPattern) {
        this.classification = Objects.requireNonNull(classification, "expected parameter 'classification' to be non-null");
        this.customPatterns = customPatterns;
        this.grokPattern = Objects.requireNonNull(grokPattern, "expected parameter 'grokPattern' to be non-null");
    }

    private ClassifierGrokClassifierArgs() {
        this.classification = Output.empty();
        this.customPatterns = Output.empty();
        this.grokPattern = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassifierGrokClassifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> classification;
        private @Nullable Output<String> customPatterns;
        private Output<String> grokPattern;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassifierGrokClassifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.customPatterns = defaults.customPatterns;
    	      this.grokPattern = defaults.grokPattern;
        }

        public Builder classification(Output<String> classification) {
            this.classification = Objects.requireNonNull(classification);
            return this;
        }

        public Builder classification(String classification) {
            this.classification = Output.of(Objects.requireNonNull(classification));
            return this;
        }

        public Builder customPatterns(@Nullable Output<String> customPatterns) {
            this.customPatterns = customPatterns;
            return this;
        }

        public Builder customPatterns(@Nullable String customPatterns) {
            this.customPatterns = Output.ofNullable(customPatterns);
            return this;
        }

        public Builder grokPattern(Output<String> grokPattern) {
            this.grokPattern = Objects.requireNonNull(grokPattern);
            return this;
        }

        public Builder grokPattern(String grokPattern) {
            this.grokPattern = Output.of(Objects.requireNonNull(grokPattern));
            return this;
        }
        public ClassifierGrokClassifierArgs build() {
            return new ClassifierGrokClassifierArgs(classification, customPatterns, grokPattern);
        }
    }
}
