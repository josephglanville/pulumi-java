// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.IPRangeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The IP access control.
 * 
 */
public final class IPAccessControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final IPAccessControlArgs Empty = new IPAccessControlArgs();

    /**
     * The IP allow list.
     * 
     */
    @InputImport(name="allow")
      private final @Nullable Input<List<IPRangeArgs>> allow;

    public Input<List<IPRangeArgs>> getAllow() {
        return this.allow == null ? Input.empty() : this.allow;
    }

    public IPAccessControlArgs(@Nullable Input<List<IPRangeArgs>> allow) {
        this.allow = allow;
    }

    private IPAccessControlArgs() {
        this.allow = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<IPRangeArgs>> allow;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAccessControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
        }

        public Builder setAllow(@Nullable Input<List<IPRangeArgs>> allow) {
            this.allow = allow;
            return this;
        }

        public Builder setAllow(@Nullable List<IPRangeArgs> allow) {
            this.allow = Input.ofNullable(allow);
            return this;
        }
        public IPAccessControlArgs build() {
            return new IPAccessControlArgs(allow);
        }
    }
}
