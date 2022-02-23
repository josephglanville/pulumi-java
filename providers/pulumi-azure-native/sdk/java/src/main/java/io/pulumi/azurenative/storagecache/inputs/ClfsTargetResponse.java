// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties pertaining to the ClfsTarget
 * 
 */
public final class ClfsTargetResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClfsTargetResponse Empty = new ClfsTargetResponse();

    /**
     * Resource ID of storage container.
     * 
     */
    @InputImport(name="target")
      private final @Nullable String target;

    public Optional<String> getTarget() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    public ClfsTargetResponse(@Nullable String target) {
        this.target = target;
    }

    private ClfsTargetResponse() {
        this.target = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClfsTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ClfsTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }
        public ClfsTargetResponse build() {
            return new ClfsTargetResponse(target);
        }
    }
}
