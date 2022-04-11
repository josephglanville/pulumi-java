// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PersistentVolumeClaimVolumeSource references the user's PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).
 * 
 */
public final class PersistentVolumeClaimVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PersistentVolumeClaimVolumeSourceArgs Empty = new PersistentVolumeClaimVolumeSourceArgs();

    /**
     * ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     * 
     */
    @Import(name="claimName", required=true)
      private final Output<String> claimName;

    public Output<String> getClaimName() {
        return this.claimName;
    }

    /**
     * Will force the ReadOnly setting in VolumeMounts. Default false.
     * 
     */
    @Import(name="readOnly")
      private final @Nullable Output<Boolean> readOnly;

    public Output<Boolean> getReadOnly() {
        return this.readOnly == null ? Codegen.empty() : this.readOnly;
    }

    public PersistentVolumeClaimVolumeSourceArgs(
        Output<String> claimName,
        @Nullable Output<Boolean> readOnly) {
        this.claimName = Objects.requireNonNull(claimName, "expected parameter 'claimName' to be non-null");
        this.readOnly = readOnly;
    }

    private PersistentVolumeClaimVolumeSourceArgs() {
        this.claimName = Codegen.empty();
        this.readOnly = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistentVolumeClaimVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> claimName;
        private @Nullable Output<Boolean> readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistentVolumeClaimVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claimName = defaults.claimName;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder claimName(Output<String> claimName) {
            this.claimName = Objects.requireNonNull(claimName);
            return this;
        }
        public Builder claimName(String claimName) {
            this.claimName = Output.of(Objects.requireNonNull(claimName));
            return this;
        }
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = Codegen.ofNullable(readOnly);
            return this;
        }        public PersistentVolumeClaimVolumeSourceArgs build() {
            return new PersistentVolumeClaimVolumeSourceArgs(claimName, readOnly);
        }
    }
}
