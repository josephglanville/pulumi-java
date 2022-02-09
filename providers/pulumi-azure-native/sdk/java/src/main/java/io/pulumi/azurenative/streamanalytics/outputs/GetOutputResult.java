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
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetOutputResult {
    private final @Nullable Object datasource;
    private final DiagnosticsResponse diagnostics;
    private final String etag;
    private final String id;
    private final @Nullable String name;
    private final @Nullable Object serialization;
    private final String type;

    @OutputCustomType.Constructor({"datasource","diagnostics","etag","id","name","serialization","type"})
    private GetOutputResult(
        @Nullable Object datasource,
        DiagnosticsResponse diagnostics,
        String etag,
        String id,
        @Nullable String name,
        @Nullable Object serialization,
        String type) {
        this.datasource = datasource;
        this.diagnostics = Objects.requireNonNull(diagnostics);
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.name = name;
        this.serialization = serialization;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<Object> getDatasource() {
        return Optional.ofNullable(this.datasource);
    }
    public DiagnosticsResponse getDiagnostics() {
        return this.diagnostics;
    }
    public String getEtag() {
        return this.etag;
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<Object> getSerialization() {
        return Optional.ofNullable(this.serialization);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOutputResult defaults) {
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

        public Builder(GetOutputResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasource = defaults.datasource;
    	      this.diagnostics = defaults.diagnostics;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.serialization = defaults.serialization;
    	      this.type = defaults.type;
        }

        public Builder setDatasource(@Nullable Object datasource) {
            this.datasource = datasource;
            return this;
        }

        public Builder setDiagnostics(DiagnosticsResponse diagnostics) {
            this.diagnostics = Objects.requireNonNull(diagnostics);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSerialization(@Nullable Object serialization) {
            this.serialization = serialization;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetOutputResult build() {
            return new GetOutputResult(datasource, diagnostics, etag, id, name, serialization, type);
        }
    }
}
