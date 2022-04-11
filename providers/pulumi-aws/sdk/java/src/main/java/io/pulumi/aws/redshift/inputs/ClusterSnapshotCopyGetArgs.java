// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterSnapshotCopyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterSnapshotCopyGetArgs Empty = new ClusterSnapshotCopyGetArgs();

    /**
     * The destination region that you want to copy snapshots to.
     * 
     */
    @Import(name="destinationRegion", required=true)
      private final Output<String> destinationRegion;

    public Output<String> getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * The name of the snapshot copy grant to use when snapshots of an AWS KMS-encrypted cluster are copied to the destination region.
     * 
     */
    @Import(name="grantName")
      private final @Nullable Output<String> grantName;

    public Output<String> getGrantName() {
        return this.grantName == null ? Codegen.empty() : this.grantName;
    }

    /**
     * The number of days to retain automated snapshots in the destination region after they are copied from the source region. Defaults to `7`.
     * 
     */
    @Import(name="retentionPeriod")
      private final @Nullable Output<Integer> retentionPeriod;

    public Output<Integer> getRetentionPeriod() {
        return this.retentionPeriod == null ? Codegen.empty() : this.retentionPeriod;
    }

    public ClusterSnapshotCopyGetArgs(
        Output<String> destinationRegion,
        @Nullable Output<String> grantName,
        @Nullable Output<Integer> retentionPeriod) {
        this.destinationRegion = Objects.requireNonNull(destinationRegion, "expected parameter 'destinationRegion' to be non-null");
        this.grantName = grantName;
        this.retentionPeriod = retentionPeriod;
    }

    private ClusterSnapshotCopyGetArgs() {
        this.destinationRegion = Codegen.empty();
        this.grantName = Codegen.empty();
        this.retentionPeriod = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSnapshotCopyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> destinationRegion;
        private @Nullable Output<String> grantName;
        private @Nullable Output<Integer> retentionPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterSnapshotCopyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationRegion = defaults.destinationRegion;
    	      this.grantName = defaults.grantName;
    	      this.retentionPeriod = defaults.retentionPeriod;
        }

        public Builder destinationRegion(Output<String> destinationRegion) {
            this.destinationRegion = Objects.requireNonNull(destinationRegion);
            return this;
        }
        public Builder destinationRegion(String destinationRegion) {
            this.destinationRegion = Output.of(Objects.requireNonNull(destinationRegion));
            return this;
        }
        public Builder grantName(@Nullable Output<String> grantName) {
            this.grantName = grantName;
            return this;
        }
        public Builder grantName(@Nullable String grantName) {
            this.grantName = Codegen.ofNullable(grantName);
            return this;
        }
        public Builder retentionPeriod(@Nullable Output<Integer> retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }
        public Builder retentionPeriod(@Nullable Integer retentionPeriod) {
            this.retentionPeriod = Codegen.ofNullable(retentionPeriod);
            return this;
        }        public ClusterSnapshotCopyGetArgs build() {
            return new ClusterSnapshotCopyGetArgs(destinationRegion, grantName, retentionPeriod);
        }
    }
}
