// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.jobs_v3.inputs.CompensationEntryArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Job compensation details.
 * 
 */
public final class CompensationInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final CompensationInfoArgs Empty = new CompensationInfoArgs();

    /**
     * Optional. Job compensation information. At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as ** base compensation entry ** for the job.
     * 
     */
    @Import(name="entries")
      private final @Nullable Output<List<CompensationEntryArgs>> entries;

    public Output<List<CompensationEntryArgs>> getEntries() {
        return this.entries == null ? Codegen.empty() : this.entries;
    }

    public CompensationInfoArgs(@Nullable Output<List<CompensationEntryArgs>> entries) {
        this.entries = entries;
    }

    private CompensationInfoArgs() {
        this.entries = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompensationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CompensationEntryArgs>> entries;

        public Builder() {
    	      // Empty
        }

        public Builder(CompensationInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entries = defaults.entries;
        }

        public Builder entries(@Nullable Output<List<CompensationEntryArgs>> entries) {
            this.entries = entries;
            return this;
        }
        public Builder entries(@Nullable List<CompensationEntryArgs> entries) {
            this.entries = Codegen.ofNullable(entries);
            return this;
        }
        public Builder entries(CompensationEntryArgs... entries) {
            return entries(List.of(entries));
        }        public CompensationInfoArgs build() {
            return new CompensationInfoArgs(entries);
        }
    }
}
