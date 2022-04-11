// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a specific Cloud SQL instance.
 * 
 */
public final class GoogleCloudRunOpV2CloudSqlInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunOpV2CloudSqlInstanceArgs Empty = new GoogleCloudRunOpV2CloudSqlInstanceArgs();

    /**
     * The Cloud SQL instance connection names, as can be found in https://console.cloud.google.com/sql/instances. Visit https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect Cloud SQL and Cloud Run. Format: {project}:{location}:{instance}
     * 
     */
    @Import(name="connections")
      private final @Nullable Output<List<String>> connections;

    public Output<List<String>> getConnections() {
        return this.connections == null ? Codegen.empty() : this.connections;
    }

    public GoogleCloudRunOpV2CloudSqlInstanceArgs(@Nullable Output<List<String>> connections) {
        this.connections = connections;
    }

    private GoogleCloudRunOpV2CloudSqlInstanceArgs() {
        this.connections = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2CloudSqlInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> connections;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2CloudSqlInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connections = defaults.connections;
        }

        public Builder connections(@Nullable Output<List<String>> connections) {
            this.connections = connections;
            return this;
        }
        public Builder connections(@Nullable List<String> connections) {
            this.connections = Codegen.ofNullable(connections);
            return this;
        }
        public Builder connections(String... connections) {
            return connections(List.of(connections));
        }        public GoogleCloudRunOpV2CloudSqlInstanceArgs build() {
            return new GoogleCloudRunOpV2CloudSqlInstanceArgs(connections);
        }
    }
}
