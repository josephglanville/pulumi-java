// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ParticipantProfilePropertyReferenceResponse {
    private final String interactionPropertyName;
    private final String profilePropertyName;

    @OutputCustomType.Constructor({"interactionPropertyName","profilePropertyName"})
    private ParticipantProfilePropertyReferenceResponse(
        String interactionPropertyName,
        String profilePropertyName) {
        this.interactionPropertyName = Objects.requireNonNull(interactionPropertyName);
        this.profilePropertyName = Objects.requireNonNull(profilePropertyName);
    }

    public String getInteractionPropertyName() {
        return this.interactionPropertyName;
    }
    public String getProfilePropertyName() {
        return this.profilePropertyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParticipantProfilePropertyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String interactionPropertyName;
        private String profilePropertyName;

        public Builder() {
    	      // Empty
        }

        public Builder(ParticipantProfilePropertyReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interactionPropertyName = defaults.interactionPropertyName;
    	      this.profilePropertyName = defaults.profilePropertyName;
        }

        public Builder setInteractionPropertyName(String interactionPropertyName) {
            this.interactionPropertyName = Objects.requireNonNull(interactionPropertyName);
            return this;
        }

        public Builder setProfilePropertyName(String profilePropertyName) {
            this.profilePropertyName = Objects.requireNonNull(profilePropertyName);
            return this;
        }

        public ParticipantProfilePropertyReferenceResponse build() {
            return new ParticipantProfilePropertyReferenceResponse(interactionPropertyName, profilePropertyName);
        }
    }
}
