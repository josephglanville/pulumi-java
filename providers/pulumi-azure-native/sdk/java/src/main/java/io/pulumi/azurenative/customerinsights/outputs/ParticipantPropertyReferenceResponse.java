// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ParticipantPropertyReferenceResponse {
    /**
     * The source property that maps to the target property.
     * 
     */
    private final String sourcePropertyName;
    /**
     * The target property that maps to the source property.
     * 
     */
    private final String targetPropertyName;

    @CustomType.Constructor
    private ParticipantPropertyReferenceResponse(
        @CustomType.Parameter("sourcePropertyName") String sourcePropertyName,
        @CustomType.Parameter("targetPropertyName") String targetPropertyName) {
        this.sourcePropertyName = sourcePropertyName;
        this.targetPropertyName = targetPropertyName;
    }

    /**
     * The source property that maps to the target property.
     * 
    */
    public String getSourcePropertyName() {
        return this.sourcePropertyName;
    }
    /**
     * The target property that maps to the source property.
     * 
    */
    public String getTargetPropertyName() {
        return this.targetPropertyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParticipantPropertyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sourcePropertyName;
        private String targetPropertyName;

        public Builder() {
    	      // Empty
        }

        public Builder(ParticipantPropertyReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourcePropertyName = defaults.sourcePropertyName;
    	      this.targetPropertyName = defaults.targetPropertyName;
        }

        public Builder sourcePropertyName(String sourcePropertyName) {
            this.sourcePropertyName = Objects.requireNonNull(sourcePropertyName);
            return this;
        }
        public Builder targetPropertyName(String targetPropertyName) {
            this.targetPropertyName = Objects.requireNonNull(targetPropertyName);
            return this;
        }        public ParticipantPropertyReferenceResponse build() {
            return new ParticipantPropertyReferenceResponse(sourcePropertyName, targetPropertyName);
        }
    }
}
