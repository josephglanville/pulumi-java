// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.datamigration_v1beta1.enums.ConnectionProfileProvider;
import io.pulumi.googlenative.datamigration_v1beta1.enums.ConnectionProfileState;
import io.pulumi.googlenative.datamigration_v1beta1.inputs.CloudSqlConnectionProfileArgs;
import io.pulumi.googlenative.datamigration_v1beta1.inputs.MySqlConnectionProfileArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionProfileArgs Empty = new ConnectionProfileArgs();

    /**
     * A CloudSQL database connection profile.
     * 
     */
    @Import(name="cloudsql")
      private final @Nullable Output<CloudSqlConnectionProfileArgs> cloudsql;

    public Output<CloudSqlConnectionProfileArgs> getCloudsql() {
        return this.cloudsql == null ? Codegen.empty() : this.cloudsql;
    }

    @Import(name="connectionProfileId", required=true)
      private final Output<String> connectionProfileId;

    public Output<String> getConnectionProfileId() {
        return this.connectionProfileId;
    }

    /**
     * The connection profile display name.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The resource labels for connection profile to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * A MySQL database connection profile.
     * 
     */
    @Import(name="mysql")
      private final @Nullable Output<MySqlConnectionProfileArgs> mysql;

    public Output<MySqlConnectionProfileArgs> getMysql() {
        return this.mysql == null ? Codegen.empty() : this.mysql;
    }

    /**
     * The name of this connection profile resource in the form of projects/{project}/locations/{location}/connectionProfiles/{connectionProfile}.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The database provider.
     * 
     */
    @Import(name="provider")
      private final @Nullable Output<ConnectionProfileProvider> provider;

    public Output<ConnectionProfileProvider> getProvider() {
        return this.provider == null ? Codegen.empty() : this.provider;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * The current connection profile state (e.g. DRAFT, READY, or FAILED).
     * 
     */
    @Import(name="state")
      private final @Nullable Output<ConnectionProfileState> state;

    public Output<ConnectionProfileState> getState() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    public ConnectionProfileArgs(
        @Nullable Output<CloudSqlConnectionProfileArgs> cloudsql,
        Output<String> connectionProfileId,
        @Nullable Output<String> displayName,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<MySqlConnectionProfileArgs> mysql,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<ConnectionProfileProvider> provider,
        @Nullable Output<String> requestId,
        @Nullable Output<ConnectionProfileState> state) {
        this.cloudsql = cloudsql;
        this.connectionProfileId = Objects.requireNonNull(connectionProfileId, "expected parameter 'connectionProfileId' to be non-null");
        this.displayName = displayName;
        this.labels = labels;
        this.location = location;
        this.mysql = mysql;
        this.name = name;
        this.project = project;
        this.provider = provider;
        this.requestId = requestId;
        this.state = state;
    }

    private ConnectionProfileArgs() {
        this.cloudsql = Codegen.empty();
        this.connectionProfileId = Codegen.empty();
        this.displayName = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.mysql = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.provider = Codegen.empty();
        this.requestId = Codegen.empty();
        this.state = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CloudSqlConnectionProfileArgs> cloudsql;
        private Output<String> connectionProfileId;
        private @Nullable Output<String> displayName;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<MySqlConnectionProfileArgs> mysql;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<ConnectionProfileProvider> provider;
        private @Nullable Output<String> requestId;
        private @Nullable Output<ConnectionProfileState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudsql = defaults.cloudsql;
    	      this.connectionProfileId = defaults.connectionProfileId;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.mysql = defaults.mysql;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.provider = defaults.provider;
    	      this.requestId = defaults.requestId;
    	      this.state = defaults.state;
        }

        public Builder cloudsql(@Nullable Output<CloudSqlConnectionProfileArgs> cloudsql) {
            this.cloudsql = cloudsql;
            return this;
        }
        public Builder cloudsql(@Nullable CloudSqlConnectionProfileArgs cloudsql) {
            this.cloudsql = Codegen.ofNullable(cloudsql);
            return this;
        }
        public Builder connectionProfileId(Output<String> connectionProfileId) {
            this.connectionProfileId = Objects.requireNonNull(connectionProfileId);
            return this;
        }
        public Builder connectionProfileId(String connectionProfileId) {
            this.connectionProfileId = Output.of(Objects.requireNonNull(connectionProfileId));
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder mysql(@Nullable Output<MySqlConnectionProfileArgs> mysql) {
            this.mysql = mysql;
            return this;
        }
        public Builder mysql(@Nullable MySqlConnectionProfileArgs mysql) {
            this.mysql = Codegen.ofNullable(mysql);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder provider(@Nullable Output<ConnectionProfileProvider> provider) {
            this.provider = provider;
            return this;
        }
        public Builder provider(@Nullable ConnectionProfileProvider provider) {
            this.provider = Codegen.ofNullable(provider);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder state(@Nullable Output<ConnectionProfileState> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable ConnectionProfileState state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }        public ConnectionProfileArgs build() {
            return new ConnectionProfileArgs(cloudsql, connectionProfileId, displayName, labels, location, mysql, name, project, provider, requestId, state);
        }
    }
}
