// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.azurenative.streamanalytics.outputs.AvroSerializationResponse;
import io.pulumi.azurenative.streamanalytics.outputs.AzureDataLakeStoreOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.AzureSqlDatabaseOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.AzureTableOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.BlobOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.CsvSerializationResponse;
import io.pulumi.azurenative.streamanalytics.outputs.DiagnosticsResponse;
import io.pulumi.azurenative.streamanalytics.outputs.DocumentDbOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.EventHubOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.JsonSerializationResponse;
import io.pulumi.azurenative.streamanalytics.outputs.PowerBIOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.ServiceBusQueueOutputDataSourceResponse;
import io.pulumi.azurenative.streamanalytics.outputs.ServiceBusTopicOutputDataSourceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OutputResponse {
    /**
     * Describes the data source that output will be written to. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable Object datasource;
    /**
     * Describes conditions applicable to the Input, Output, or the job overall, that warrant customer attention.
     * 
     */
    private final DiagnosticsResponse diagnostics;
    /**
     * The current entity tag for the output. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    private final String etag;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource name
     * 
     */
    private final @Nullable String name;
    /**
     * Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable Object serialization;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private OutputResponse(
        @CustomType.Parameter("datasource") @Nullable Object datasource,
        @CustomType.Parameter("diagnostics") DiagnosticsResponse diagnostics,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("serialization") @Nullable Object serialization,
        @CustomType.Parameter("type") String type) {
        this.datasource = datasource;
        this.diagnostics = diagnostics;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.serialization = serialization;
        this.type = type;
    }

    /**
     * Describes the data source that output will be written to. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<Object> getDatasource() {
        return Optional.ofNullable(this.datasource);
    }
    /**
     * Describes conditions applicable to the Input, Output, or the job overall, that warrant customer attention.
     * 
    */
    public DiagnosticsResponse getDiagnostics() {
        return this.diagnostics;
    }
    /**
     * The current entity tag for the output. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Describes how data from an input is serialized or how data is serialized when written to an output. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<Object> getSerialization() {
        return Optional.ofNullable(this.serialization);
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
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
