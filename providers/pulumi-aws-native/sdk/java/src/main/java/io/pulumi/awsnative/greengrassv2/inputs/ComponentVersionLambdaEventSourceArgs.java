// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.greengrassv2.inputs;

import io.pulumi.awsnative.greengrassv2.enums.ComponentVersionLambdaEventSourceType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComponentVersionLambdaEventSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComponentVersionLambdaEventSourceArgs Empty = new ComponentVersionLambdaEventSourceArgs();

    @InputImport(name="topic")
      private final @Nullable Input<String> topic;

    public Input<String> getTopic() {
        return this.topic == null ? Input.empty() : this.topic;
    }

    @InputImport(name="type")
      private final @Nullable Input<ComponentVersionLambdaEventSourceType> type;

    public Input<ComponentVersionLambdaEventSourceType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ComponentVersionLambdaEventSourceArgs(
        @Nullable Input<String> topic,
        @Nullable Input<ComponentVersionLambdaEventSourceType> type) {
        this.topic = topic;
        this.type = type;
    }

    private ComponentVersionLambdaEventSourceArgs() {
        this.topic = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentVersionLambdaEventSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> topic;
        private @Nullable Input<ComponentVersionLambdaEventSourceType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentVersionLambdaEventSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topic = defaults.topic;
    	      this.type = defaults.type;
        }

        public Builder setTopic(@Nullable Input<String> topic) {
            this.topic = topic;
            return this;
        }

        public Builder setTopic(@Nullable String topic) {
            this.topic = Input.ofNullable(topic);
            return this;
        }

        public Builder setType(@Nullable Input<ComponentVersionLambdaEventSourceType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable ComponentVersionLambdaEventSourceType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ComponentVersionLambdaEventSourceArgs build() {
            return new ComponentVersionLambdaEventSourceArgs(topic, type);
        }
    }
}
