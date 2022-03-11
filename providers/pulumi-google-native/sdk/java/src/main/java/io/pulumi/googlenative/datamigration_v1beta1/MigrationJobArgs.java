// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datamigration_v1beta1.enums.MigrationJobState;
import io.pulumi.googlenative.datamigration_v1beta1.enums.MigrationJobType;
import io.pulumi.googlenative.datamigration_v1beta1.inputs.DatabaseTypeArgs;
import io.pulumi.googlenative.datamigration_v1beta1.inputs.ReverseSshConnectivityArgs;
import io.pulumi.googlenative.datamigration_v1beta1.inputs.StaticIpConnectivityArgs;
import io.pulumi.googlenative.datamigration_v1beta1.inputs.VpcPeeringConnectivityArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MigrationJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrationJobArgs Empty = new MigrationJobArgs();

    /**
     * The resource name (URI) of the destination connection profile.
     * 
     */
    @InputImport(name="destination", required=true)
      private final Output<String> destination;

    public Output<String> getDestination() {
        return this.destination;
    }

    /**
     * The database engine type and provider of the destination.
     * 
     */
    @InputImport(name="destinationDatabase")
      private final @Nullable Output<DatabaseTypeArgs> destinationDatabase;

    public Output<DatabaseTypeArgs> getDestinationDatabase() {
        return this.destinationDatabase == null ? Output.empty() : this.destinationDatabase;
    }

    /**
     * The migration job display name.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * The path to the dump file in Google Cloud Storage, in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
     * 
     */
    @InputImport(name="dumpPath")
      private final @Nullable Output<String> dumpPath;

    public Output<String> getDumpPath() {
        return this.dumpPath == null ? Output.empty() : this.dumpPath;
    }

    /**
     * The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    @InputImport(name="migrationJobId", required=true)
      private final Output<String> migrationJobId;

    public Output<String> getMigrationJobId() {
        return this.migrationJobId;
    }

    /**
     * The name (URI) of this migration job resource, in the form of: projects/{project}/locations/{location}/migrationJobs/{migrationJob}.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    /**
     * The details needed to communicate to the source over Reverse SSH tunnel connectivity.
     * 
     */
    @InputImport(name="reverseSshConnectivity")
      private final @Nullable Output<ReverseSshConnectivityArgs> reverseSshConnectivity;

    public Output<ReverseSshConnectivityArgs> getReverseSshConnectivity() {
        return this.reverseSshConnectivity == null ? Output.empty() : this.reverseSshConnectivity;
    }

    /**
     * The resource name (URI) of the source connection profile.
     * 
     */
    @InputImport(name="source", required=true)
      private final Output<String> source;

    public Output<String> getSource() {
        return this.source;
    }

    /**
     * The database engine type and provider of the source.
     * 
     */
    @InputImport(name="sourceDatabase")
      private final @Nullable Output<DatabaseTypeArgs> sourceDatabase;

    public Output<DatabaseTypeArgs> getSourceDatabase() {
        return this.sourceDatabase == null ? Output.empty() : this.sourceDatabase;
    }

    /**
     * The current migration job state.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Output<MigrationJobState> state;

    public Output<MigrationJobState> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * static ip connectivity data (default, no additional details needed).
     * 
     */
    @InputImport(name="staticIpConnectivity")
      private final @Nullable Output<StaticIpConnectivityArgs> staticIpConnectivity;

    public Output<StaticIpConnectivityArgs> getStaticIpConnectivity() {
        return this.staticIpConnectivity == null ? Output.empty() : this.staticIpConnectivity;
    }

    /**
     * The migration job type.
     * 
     */
    @InputImport(name="type", required=true)
      private final Output<MigrationJobType> type;

    public Output<MigrationJobType> getType() {
        return this.type;
    }

    /**
     * The details of the VPC network that the source database is located in.
     * 
     */
    @InputImport(name="vpcPeeringConnectivity")
      private final @Nullable Output<VpcPeeringConnectivityArgs> vpcPeeringConnectivity;

    public Output<VpcPeeringConnectivityArgs> getVpcPeeringConnectivity() {
        return this.vpcPeeringConnectivity == null ? Output.empty() : this.vpcPeeringConnectivity;
    }

    public MigrationJobArgs(
        Output<String> destination,
        @Nullable Output<DatabaseTypeArgs> destinationDatabase,
        @Nullable Output<String> displayName,
        @Nullable Output<String> dumpPath,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        Output<String> migrationJobId,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<ReverseSshConnectivityArgs> reverseSshConnectivity,
        Output<String> source,
        @Nullable Output<DatabaseTypeArgs> sourceDatabase,
        @Nullable Output<MigrationJobState> state,
        @Nullable Output<StaticIpConnectivityArgs> staticIpConnectivity,
        Output<MigrationJobType> type,
        @Nullable Output<VpcPeeringConnectivityArgs> vpcPeeringConnectivity) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.destinationDatabase = destinationDatabase;
        this.displayName = displayName;
        this.dumpPath = dumpPath;
        this.labels = labels;
        this.location = location;
        this.migrationJobId = Objects.requireNonNull(migrationJobId, "expected parameter 'migrationJobId' to be non-null");
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.reverseSshConnectivity = reverseSshConnectivity;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.sourceDatabase = sourceDatabase;
        this.state = state;
        this.staticIpConnectivity = staticIpConnectivity;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.vpcPeeringConnectivity = vpcPeeringConnectivity;
    }

    private MigrationJobArgs() {
        this.destination = Output.empty();
        this.destinationDatabase = Output.empty();
        this.displayName = Output.empty();
        this.dumpPath = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.migrationJobId = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.requestId = Output.empty();
        this.reverseSshConnectivity = Output.empty();
        this.source = Output.empty();
        this.sourceDatabase = Output.empty();
        this.state = Output.empty();
        this.staticIpConnectivity = Output.empty();
        this.type = Output.empty();
        this.vpcPeeringConnectivity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> destination;
        private @Nullable Output<DatabaseTypeArgs> destinationDatabase;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> dumpPath;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private Output<String> migrationJobId;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<ReverseSshConnectivityArgs> reverseSshConnectivity;
        private Output<String> source;
        private @Nullable Output<DatabaseTypeArgs> sourceDatabase;
        private @Nullable Output<MigrationJobState> state;
        private @Nullable Output<StaticIpConnectivityArgs> staticIpConnectivity;
        private Output<MigrationJobType> type;
        private @Nullable Output<VpcPeeringConnectivityArgs> vpcPeeringConnectivity;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.destinationDatabase = defaults.destinationDatabase;
    	      this.displayName = defaults.displayName;
    	      this.dumpPath = defaults.dumpPath;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.migrationJobId = defaults.migrationJobId;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.reverseSshConnectivity = defaults.reverseSshConnectivity;
    	      this.source = defaults.source;
    	      this.sourceDatabase = defaults.sourceDatabase;
    	      this.state = defaults.state;
    	      this.staticIpConnectivity = defaults.staticIpConnectivity;
    	      this.type = defaults.type;
    	      this.vpcPeeringConnectivity = defaults.vpcPeeringConnectivity;
        }

        public Builder destination(Output<String> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder destination(String destination) {
            this.destination = Output.of(Objects.requireNonNull(destination));
            return this;
        }

        public Builder destinationDatabase(@Nullable Output<DatabaseTypeArgs> destinationDatabase) {
            this.destinationDatabase = destinationDatabase;
            return this;
        }

        public Builder destinationDatabase(@Nullable DatabaseTypeArgs destinationDatabase) {
            this.destinationDatabase = Output.ofNullable(destinationDatabase);
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder dumpPath(@Nullable Output<String> dumpPath) {
            this.dumpPath = dumpPath;
            return this;
        }

        public Builder dumpPath(@Nullable String dumpPath) {
            this.dumpPath = Output.ofNullable(dumpPath);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder migrationJobId(Output<String> migrationJobId) {
            this.migrationJobId = Objects.requireNonNull(migrationJobId);
            return this;
        }

        public Builder migrationJobId(String migrationJobId) {
            this.migrationJobId = Output.of(Objects.requireNonNull(migrationJobId));
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }

        public Builder reverseSshConnectivity(@Nullable Output<ReverseSshConnectivityArgs> reverseSshConnectivity) {
            this.reverseSshConnectivity = reverseSshConnectivity;
            return this;
        }

        public Builder reverseSshConnectivity(@Nullable ReverseSshConnectivityArgs reverseSshConnectivity) {
            this.reverseSshConnectivity = Output.ofNullable(reverseSshConnectivity);
            return this;
        }

        public Builder source(Output<String> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder source(String source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }

        public Builder sourceDatabase(@Nullable Output<DatabaseTypeArgs> sourceDatabase) {
            this.sourceDatabase = sourceDatabase;
            return this;
        }

        public Builder sourceDatabase(@Nullable DatabaseTypeArgs sourceDatabase) {
            this.sourceDatabase = Output.ofNullable(sourceDatabase);
            return this;
        }

        public Builder state(@Nullable Output<MigrationJobState> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable MigrationJobState state) {
            this.state = Output.ofNullable(state);
            return this;
        }

        public Builder staticIpConnectivity(@Nullable Output<StaticIpConnectivityArgs> staticIpConnectivity) {
            this.staticIpConnectivity = staticIpConnectivity;
            return this;
        }

        public Builder staticIpConnectivity(@Nullable StaticIpConnectivityArgs staticIpConnectivity) {
            this.staticIpConnectivity = Output.ofNullable(staticIpConnectivity);
            return this;
        }

        public Builder type(Output<MigrationJobType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(MigrationJobType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder vpcPeeringConnectivity(@Nullable Output<VpcPeeringConnectivityArgs> vpcPeeringConnectivity) {
            this.vpcPeeringConnectivity = vpcPeeringConnectivity;
            return this;
        }

        public Builder vpcPeeringConnectivity(@Nullable VpcPeeringConnectivityArgs vpcPeeringConnectivity) {
            this.vpcPeeringConnectivity = Output.ofNullable(vpcPeeringConnectivity);
            return this;
        }
        public MigrationJobArgs build() {
            return new MigrationJobArgs(destination, destinationDatabase, displayName, dumpPath, labels, location, migrationJobId, name, project, requestId, reverseSshConnectivity, source, sourceDatabase, state, staticIpConnectivity, type, vpcPeeringConnectivity);
        }
    }
}
