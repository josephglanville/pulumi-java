// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.IPAccessControlArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LiveEventPreviewAccessControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiveEventPreviewAccessControlArgs Empty = new LiveEventPreviewAccessControlArgs();

    @InputImport(name="ip")
    private final @Nullable Input<IPAccessControlArgs> ip;

    public Input<IPAccessControlArgs> getIp() {
        return this.ip == null ? Input.empty() : this.ip;
    }

    public LiveEventPreviewAccessControlArgs(@Nullable Input<IPAccessControlArgs> ip) {
        this.ip = ip;
    }

    private LiveEventPreviewAccessControlArgs() {
        this.ip = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventPreviewAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IPAccessControlArgs> ip;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventPreviewAccessControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
        }

        public Builder setIp(@Nullable Input<IPAccessControlArgs> ip) {
            this.ip = ip;
            return this;
        }

        public Builder setIp(@Nullable IPAccessControlArgs ip) {
            this.ip = Input.ofNullable(ip);
            return this;
        }

        public LiveEventPreviewAccessControlArgs build() {
            return new LiveEventPreviewAccessControlArgs(ip);
        }
    }
}
