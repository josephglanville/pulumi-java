// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.azurenative.streamanalytics.inputs.AvroSerializationResponse;
import io.pulumi.azurenative.streamanalytics.inputs.AzureDataLakeStoreOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.inputs.AzureSqlDatabaseOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.inputs.AzureTableOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.inputs.BlobOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.inputs.CsvSerializationResponse;
import io.pulumi.azurenative.streamanalytics.inputs.DiagnosticsResponse;
import io.pulumi.azurenative.streamanalytics.inputs.DocumentDbOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.inputs.EventHubOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.inputs.JsonSerializationResponse;
import io.pulumi.azurenative.streamanalytics.inputs.PowerBIOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.inputs.ServiceBusQueueOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.inputs.ServiceBusTopicOutputDataSourceResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An output object, containing all information associated with the named output. All outputs are contained under a streaming job.
 * 
 */
public final class OutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final OutputResponse Empty = new OutputResponse();

    /**
     * Describes the data source that output will be written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="datasource")
      private final @Nullable Object datasource;

    public Object getDatasource() {
        return this.datasource == null ? null : this.datasource;
    }

    /**
     * Describes conditions applicable to the Input, Output, or the job overall, that warrant customer attention.
     * 
     */
    @Import(name="diagnostics", required=true)
      private final DiagnosticsResponse diagnostics;

    public DiagnosticsResponse getDiagnostics() {
        return this.diagnostics;
    }

    /**
     * The current entity tag for the output. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource Id
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Resource name
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="serialization")
      private final @Nullable Object serialization;

    public Object getSerialization() {
        return this.serialization == null ? null : this.serialization;
    }

    /**
     * Resource type
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public OutputResponse(
        @Nullable Object datasource,
        DiagnosticsResponse diagnostics,
        String etag,
        String id,
        @Nullable String name,
        @Nullable Object serialization,
        String type) {
        this.datasource = datasource;
        this.diagnostics = Objects.requireNonNull(diagnostics, "expected parameter 'diagnostics' to be non-null");
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = name;
        this.serialization = serialization;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private OutputResponse() {
        this.datasource = null;
        this.diagnostics = null;
        this.etag = null;
        this.id = null;
        this.name = null;
        this.serialization = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object datasource;
        private DiagnosticsResponse diagnostics;
        private String etag;
        private String id;
        private @Nullable String name;
        private @Nullable Object serialization;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(OutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasource = defaults.datasource;
    	      this.diagnostics = defaults.diagnostics;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.serialization = defaults.serialization;
    	      this.type = defaults.type;
        }

        public Builder datasource(@Nullable Object datasource) {
            this.datasource = datasource;
            return this;
        }
        public Builder diagnostics(DiagnosticsResponse diagnostics) {
            this.diagnostics = Objects.requireNonNull(diagnostics);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder serialization(@Nullable Object serialization) {
            this.serialization = serialization;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public OutputResponse build() {
            return new OutputResponse(datasource, diagnostics, etag, id, name, serialization, type);
        }
    }
}
