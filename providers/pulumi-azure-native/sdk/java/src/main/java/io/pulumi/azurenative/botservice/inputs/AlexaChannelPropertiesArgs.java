// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class AlexaChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlexaChannelPropertiesArgs Empty = new AlexaChannelPropertiesArgs();

    @InputImport(name="alexaSkillId", required=true)
    private final Input<String> alexaSkillId;

    public Input<String> getAlexaSkillId() {
        return this.alexaSkillId;
    }

    @InputImport(name="isEnabled", required=true)
    private final Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    public AlexaChannelPropertiesArgs(
        Input<String> alexaSkillId,
        Input<Boolean> isEnabled) {
        this.alexaSkillId = Objects.requireNonNull(alexaSkillId, "expected parameter 'alexaSkillId' to be non-null");
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
    }

    private AlexaChannelPropertiesArgs() {
        this.alexaSkillId = Input.empty();
        this.isEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlexaChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> alexaSkillId;
        private Input<Boolean> isEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(AlexaChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alexaSkillId = defaults.alexaSkillId;
    	      this.isEnabled = defaults.isEnabled;
        }

        public Builder setAlexaSkillId(Input<String> alexaSkillId) {
            this.alexaSkillId = Objects.requireNonNull(alexaSkillId);
            return this;
        }

        public Builder setAlexaSkillId(String alexaSkillId) {
            this.alexaSkillId = Input.of(Objects.requireNonNull(alexaSkillId));
            return this;
        }

        public Builder setIsEnabled(Input<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Input.of(Objects.requireNonNull(isEnabled));
            return this;
        }

        public AlexaChannelPropertiesArgs build() {
            return new AlexaChannelPropertiesArgs(alexaSkillId, isEnabled);
        }
    }
}
