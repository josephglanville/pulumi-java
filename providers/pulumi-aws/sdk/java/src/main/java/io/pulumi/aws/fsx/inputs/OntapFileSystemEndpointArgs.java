// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.aws.fsx.inputs.OntapFileSystemEndpointInterclusterArgs;
import io.pulumi.aws.fsx.inputs.OntapFileSystemEndpointManagementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OntapFileSystemEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final OntapFileSystemEndpointArgs Empty = new OntapFileSystemEndpointArgs();

    /**
     * An endpoint for managing your file system by setting up NetApp SnapMirror with other ONTAP systems. See Endpoint.
     * 
     */
    @Import(name="interclusters")
      private final @Nullable Output<List<OntapFileSystemEndpointInterclusterArgs>> interclusters;

    public Output<List<OntapFileSystemEndpointInterclusterArgs>> getInterclusters() {
        return this.interclusters == null ? Output.empty() : this.interclusters;
    }

    /**
     * An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API. See Endpoint.
     * 
     */
    @Import(name="managements")
      private final @Nullable Output<List<OntapFileSystemEndpointManagementArgs>> managements;

    public Output<List<OntapFileSystemEndpointManagementArgs>> getManagements() {
        return this.managements == null ? Output.empty() : this.managements;
    }

    public OntapFileSystemEndpointArgs(
        @Nullable Output<List<OntapFileSystemEndpointInterclusterArgs>> interclusters,
        @Nullable Output<List<OntapFileSystemEndpointManagementArgs>> managements) {
        this.interclusters = interclusters;
        this.managements = managements;
    }

    private OntapFileSystemEndpointArgs() {
        this.interclusters = Output.empty();
        this.managements = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapFileSystemEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<OntapFileSystemEndpointInterclusterArgs>> interclusters;
        private @Nullable Output<List<OntapFileSystemEndpointManagementArgs>> managements;

        public Builder() {
    	      // Empty
        }

        public Builder(OntapFileSystemEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interclusters = defaults.interclusters;
    	      this.managements = defaults.managements;
        }

        public Builder interclusters(@Nullable Output<List<OntapFileSystemEndpointInterclusterArgs>> interclusters) {
            this.interclusters = interclusters;
            return this;
        }
        public Builder interclusters(@Nullable List<OntapFileSystemEndpointInterclusterArgs> interclusters) {
            this.interclusters = Output.ofNullable(interclusters);
            return this;
        }
        public Builder interclusters(OntapFileSystemEndpointInterclusterArgs... interclusters) {
            return interclusters(List.of(interclusters));
        }
        public Builder managements(@Nullable Output<List<OntapFileSystemEndpointManagementArgs>> managements) {
            this.managements = managements;
            return this;
        }
        public Builder managements(@Nullable List<OntapFileSystemEndpointManagementArgs> managements) {
            this.managements = Output.ofNullable(managements);
            return this;
        }
        public Builder managements(OntapFileSystemEndpointManagementArgs... managements) {
            return managements(List.of(managements));
        }        public OntapFileSystemEndpointArgs build() {
            return new OntapFileSystemEndpointArgs(interclusters, managements);
        }
    }
}
