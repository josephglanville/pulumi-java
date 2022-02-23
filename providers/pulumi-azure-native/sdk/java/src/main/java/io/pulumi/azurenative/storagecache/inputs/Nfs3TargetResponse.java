// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties pertaining to the Nfs3Target
 * 
 */
public final class Nfs3TargetResponse extends io.pulumi.resources.InvokeArgs {

    public static final Nfs3TargetResponse Empty = new Nfs3TargetResponse();

    /**
     * IP address or host name of an NFSv3 host (e.g., 10.0.44.44).
     * 
     */
    @InputImport(name="target")
      private final @Nullable String target;

    public Optional<String> getTarget() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    /**
     * Identifies the StorageCache usage model to be used for this storage target.
     * 
     */
    @InputImport(name="usageModel")
      private final @Nullable String usageModel;

    public Optional<String> getUsageModel() {
        return this.usageModel == null ? Optional.empty() : Optional.ofNullable(this.usageModel);
    }

    public Nfs3TargetResponse(
        @Nullable String target,
        @Nullable String usageModel) {
        this.target = target;
        this.usageModel = usageModel;
    }

    private Nfs3TargetResponse() {
        this.target = null;
        this.usageModel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Nfs3TargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String target;
        private @Nullable String usageModel;

        public Builder() {
    	      // Empty
        }

        public Builder(Nfs3TargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
    	      this.usageModel = defaults.usageModel;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }

        public Builder setUsageModel(@Nullable String usageModel) {
            this.usageModel = usageModel;
            return this;
        }
        public Nfs3TargetResponse build() {
            return new Nfs3TargetResponse(target, usageModel);
        }
    }
}
