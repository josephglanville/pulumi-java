// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistryEventNotificationConfigItemGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryEventNotificationConfigItemGetArgs Empty = new RegistryEventNotificationConfigItemGetArgs();

    @InputImport(name="pubsubTopicName", required=true)
      private final Input<String> pubsubTopicName;

    public Input<String> getPubsubTopicName() {
        return this.pubsubTopicName;
    }

    @InputImport(name="subfolderMatches")
      private final @Nullable Input<String> subfolderMatches;

    public Input<String> getSubfolderMatches() {
        return this.subfolderMatches == null ? Input.empty() : this.subfolderMatches;
    }

    public RegistryEventNotificationConfigItemGetArgs(
        Input<String> pubsubTopicName,
        @Nullable Input<String> subfolderMatches) {
        this.pubsubTopicName = Objects.requireNonNull(pubsubTopicName, "expected parameter 'pubsubTopicName' to be non-null");
        this.subfolderMatches = subfolderMatches;
    }

    private RegistryEventNotificationConfigItemGetArgs() {
        this.pubsubTopicName = Input.empty();
        this.subfolderMatches = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryEventNotificationConfigItemGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> pubsubTopicName;
        private @Nullable Input<String> subfolderMatches;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryEventNotificationConfigItemGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubTopicName = defaults.pubsubTopicName;
    	      this.subfolderMatches = defaults.subfolderMatches;
        }

        public Builder setPubsubTopicName(Input<String> pubsubTopicName) {
            this.pubsubTopicName = Objects.requireNonNull(pubsubTopicName);
            return this;
        }

        public Builder setPubsubTopicName(String pubsubTopicName) {
            this.pubsubTopicName = Input.of(Objects.requireNonNull(pubsubTopicName));
            return this;
        }

        public Builder setSubfolderMatches(@Nullable Input<String> subfolderMatches) {
            this.subfolderMatches = subfolderMatches;
            return this;
        }

        public Builder setSubfolderMatches(@Nullable String subfolderMatches) {
            this.subfolderMatches = Input.ofNullable(subfolderMatches);
            return this;
        }
        public RegistryEventNotificationConfigItemGetArgs build() {
            return new RegistryEventNotificationConfigItemGetArgs(pubsubTopicName, subfolderMatches);
        }
    }
}
