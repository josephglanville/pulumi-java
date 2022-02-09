// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SshPublicKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SshPublicKeyArgs Empty = new SshPublicKeyArgs();

    @InputImport(name="keyData")
    private final @Nullable Input<String> keyData;

    public Input<String> getKeyData() {
        return this.keyData == null ? Input.empty() : this.keyData;
    }

    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    public SshPublicKeyArgs(
        @Nullable Input<String> keyData,
        @Nullable Input<String> path) {
        this.keyData = keyData;
        this.path = path;
    }

    private SshPublicKeyArgs() {
        this.keyData = Input.empty();
        this.path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyData;
        private @Nullable Input<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(SshPublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyData = defaults.keyData;
    	      this.path = defaults.path;
        }

        public Builder setKeyData(@Nullable Input<String> keyData) {
            this.keyData = keyData;
            return this;
        }

        public Builder setKeyData(@Nullable String keyData) {
            this.keyData = Input.ofNullable(keyData);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public SshPublicKeyArgs build() {
            return new SshPublicKeyArgs(keyData, path);
        }
    }
}
