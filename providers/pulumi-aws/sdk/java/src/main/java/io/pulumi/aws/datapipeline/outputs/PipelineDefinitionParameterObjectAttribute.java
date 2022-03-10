// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datapipeline.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PipelineDefinitionParameterObjectAttribute {
    /**
     * Field identifier.
     * 
     */
    private final String key;
    /**
     * Field value, expressed as a String.
     * 
     */
    private final String stringValue;

    @OutputCustomType.Constructor
    private PipelineDefinitionParameterObjectAttribute(
        @OutputCustomType.Parameter("key") String key,
        @OutputCustomType.Parameter("stringValue") String stringValue) {
        this.key = key;
        this.stringValue = stringValue;
    }

    /**
     * Field identifier.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Field value, expressed as a String.
     * 
    */
    public String getStringValue() {
        return this.stringValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDefinitionParameterObjectAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDefinitionParameterObjectAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setStringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }
        public PipelineDefinitionParameterObjectAttribute build() {
            return new PipelineDefinitionParameterObjectAttribute(key, stringValue);
        }
    }
}
