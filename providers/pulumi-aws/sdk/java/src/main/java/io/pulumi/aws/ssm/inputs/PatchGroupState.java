// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchGroupState extends io.pulumi.resources.ResourceArgs {

    public static final PatchGroupState Empty = new PatchGroupState();

    /**
     * The ID of the patch baseline to register the patch group with.
     * 
     */
    @Import(name="baselineId")
      private final @Nullable Output<String> baselineId;

    public Output<String> getBaselineId() {
        return this.baselineId == null ? Output.empty() : this.baselineId;
    }

    /**
     * The name of the patch group that should be registered with the patch baseline.
     * 
     */
    @Import(name="patchGroup")
      private final @Nullable Output<String> patchGroup;

    public Output<String> getPatchGroup() {
        return this.patchGroup == null ? Output.empty() : this.patchGroup;
    }

    public PatchGroupState(
        @Nullable Output<String> baselineId,
        @Nullable Output<String> patchGroup) {
        this.baselineId = baselineId;
        this.patchGroup = patchGroup;
    }

    private PatchGroupState() {
        this.baselineId = Output.empty();
        this.patchGroup = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> baselineId;
        private @Nullable Output<String> patchGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baselineId = defaults.baselineId;
    	      this.patchGroup = defaults.patchGroup;
        }

        public Builder baselineId(@Nullable Output<String> baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Builder baselineId(@Nullable String baselineId) {
            this.baselineId = Output.ofNullable(baselineId);
            return this;
        }
        public Builder patchGroup(@Nullable Output<String> patchGroup) {
            this.patchGroup = patchGroup;
            return this;
        }
        public Builder patchGroup(@Nullable String patchGroup) {
            this.patchGroup = Output.ofNullable(patchGroup);
            return this;
        }        public PatchGroupState build() {
            return new PatchGroupState(baselineId, patchGroup);
        }
    }
}
