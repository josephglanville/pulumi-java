// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.DefaultKeyArgs;
import io.pulumi.azurenative.media.inputs.StreamingPolicyContentKeyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StreamingPolicyContentKeysArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamingPolicyContentKeysArgs Empty = new StreamingPolicyContentKeysArgs();

    @InputImport(name="defaultKey")
    private final @Nullable Input<DefaultKeyArgs> defaultKey;

    public Input<DefaultKeyArgs> getDefaultKey() {
        return this.defaultKey == null ? Input.empty() : this.defaultKey;
    }

    @InputImport(name="keyToTrackMappings")
    private final @Nullable Input<List<StreamingPolicyContentKeyArgs>> keyToTrackMappings;

    public Input<List<StreamingPolicyContentKeyArgs>> getKeyToTrackMappings() {
        return this.keyToTrackMappings == null ? Input.empty() : this.keyToTrackMappings;
    }

    public StreamingPolicyContentKeysArgs(
        @Nullable Input<DefaultKeyArgs> defaultKey,
        @Nullable Input<List<StreamingPolicyContentKeyArgs>> keyToTrackMappings) {
        this.defaultKey = defaultKey;
        this.keyToTrackMappings = keyToTrackMappings;
    }

    private StreamingPolicyContentKeysArgs() {
        this.defaultKey = Input.empty();
        this.keyToTrackMappings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingPolicyContentKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DefaultKeyArgs> defaultKey;
        private @Nullable Input<List<StreamingPolicyContentKeyArgs>> keyToTrackMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingPolicyContentKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultKey = defaults.defaultKey;
    	      this.keyToTrackMappings = defaults.keyToTrackMappings;
        }

        public Builder setDefaultKey(@Nullable Input<DefaultKeyArgs> defaultKey) {
            this.defaultKey = defaultKey;
            return this;
        }

        public Builder setDefaultKey(@Nullable DefaultKeyArgs defaultKey) {
            this.defaultKey = Input.ofNullable(defaultKey);
            return this;
        }

        public Builder setKeyToTrackMappings(@Nullable Input<List<StreamingPolicyContentKeyArgs>> keyToTrackMappings) {
            this.keyToTrackMappings = keyToTrackMappings;
            return this;
        }

        public Builder setKeyToTrackMappings(@Nullable List<StreamingPolicyContentKeyArgs> keyToTrackMappings) {
            this.keyToTrackMappings = Input.ofNullable(keyToTrackMappings);
            return this;
        }

        public StreamingPolicyContentKeysArgs build() {
            return new StreamingPolicyContentKeysArgs(defaultKey, keyToTrackMappings);
        }
    }
}
