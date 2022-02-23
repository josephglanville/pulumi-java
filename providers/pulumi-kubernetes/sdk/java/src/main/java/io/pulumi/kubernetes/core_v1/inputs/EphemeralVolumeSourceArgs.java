// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.PersistentVolumeClaimTemplateArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents an ephemeral volume that is handled by a normal storage driver.
 * 
 */
public final class EphemeralVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EphemeralVolumeSourceArgs Empty = new EphemeralVolumeSourceArgs();

    /**
     * Specifies a read-only configuration for the volume. Defaults to false (read/write).
     * 
     */
    @InputImport(name="readOnly")
      private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    /**
     * Will be used to create a stand-alone PVC to provision the volume. The pod in which this EphemeralVolumeSource is embedded will be the owner of the PVC, i.e. the PVC will be deleted together with the pod.  The name of the PVC will be `<pod name>-<volume name>` where `<volume name>` is the name from the `PodSpec.Volumes` array entry. Pod validation will reject the pod if the concatenated name is not valid for a PVC (for example, too long).
     * 
     * An existing PVC with that name that is not owned by the pod will *not* be used for the pod to avoid using an unrelated volume by mistake. Starting the pod is then blocked until the unrelated PVC is removed. If such a pre-created PVC is meant to be used by the pod, the PVC has to updated with an owner reference to the pod once the pod exists. Normally this should not be necessary, but it may be useful when manually reconstructing a broken cluster.
     * 
     * This field is read-only and no changes will be made by Kubernetes to the PVC after it has been created.
     * 
     * Required, must not be nil.
     * 
     */
    @InputImport(name="volumeClaimTemplate")
      private final @Nullable Input<PersistentVolumeClaimTemplateArgs> volumeClaimTemplate;

    public Input<PersistentVolumeClaimTemplateArgs> getVolumeClaimTemplate() {
        return this.volumeClaimTemplate == null ? Input.empty() : this.volumeClaimTemplate;
    }

    public EphemeralVolumeSourceArgs(
        @Nullable Input<Boolean> readOnly,
        @Nullable Input<PersistentVolumeClaimTemplateArgs> volumeClaimTemplate) {
        this.readOnly = readOnly;
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    private EphemeralVolumeSourceArgs() {
        this.readOnly = Input.empty();
        this.volumeClaimTemplate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EphemeralVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> readOnly;
        private @Nullable Input<PersistentVolumeClaimTemplateArgs> volumeClaimTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(EphemeralVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readOnly = defaults.readOnly;
    	      this.volumeClaimTemplate = defaults.volumeClaimTemplate;
        }

        public Builder setReadOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }

        public Builder setVolumeClaimTemplate(@Nullable Input<PersistentVolumeClaimTemplateArgs> volumeClaimTemplate) {
            this.volumeClaimTemplate = volumeClaimTemplate;
            return this;
        }

        public Builder setVolumeClaimTemplate(@Nullable PersistentVolumeClaimTemplateArgs volumeClaimTemplate) {
            this.volumeClaimTemplate = Input.ofNullable(volumeClaimTemplate);
            return this;
        }
        public EphemeralVolumeSourceArgs build() {
            return new EphemeralVolumeSourceArgs(readOnly, volumeClaimTemplate);
        }
    }
}
