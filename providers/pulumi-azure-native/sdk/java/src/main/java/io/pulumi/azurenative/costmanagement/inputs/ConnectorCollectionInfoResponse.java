// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.inputs.ConnectorCollectionErrorInfoResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Collection and ingestion information
 * 
 */
public final class ConnectorCollectionInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectorCollectionInfoResponse Empty = new ConnectorCollectionInfoResponse();

    /**
     * Error information of last collection
     * 
     */
    @InputImport(name="error")
      private final @Nullable ConnectorCollectionErrorInfoResponse error;

    public Optional<ConnectorCollectionErrorInfoResponse> getError() {
        return this.error == null ? Optional.empty() : Optional.ofNullable(this.error);
    }

    /**
     * Last time the data acquisition process initiated connecting to the external provider
     * 
     */
    @InputImport(name="lastChecked", required=true)
      private final String lastChecked;

    public String getLastChecked() {
        return this.lastChecked;
    }

    /**
     * Last time the external data was updated into Azure
     * 
     */
    @InputImport(name="lastUpdated", required=true)
      private final String lastUpdated;

    public String getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Source timestamp of external data currently available in Azure (eg AWS last processed CUR file timestamp)
     * 
     */
    @InputImport(name="sourceLastUpdated", required=true)
      private final String sourceLastUpdated;

    public String getSourceLastUpdated() {
        return this.sourceLastUpdated;
    }

    public ConnectorCollectionInfoResponse(
        @Nullable ConnectorCollectionErrorInfoResponse error,
        String lastChecked,
        String lastUpdated,
        String sourceLastUpdated) {
        this.error = error;
        this.lastChecked = Objects.requireNonNull(lastChecked, "expected parameter 'lastChecked' to be non-null");
        this.lastUpdated = Objects.requireNonNull(lastUpdated, "expected parameter 'lastUpdated' to be non-null");
        this.sourceLastUpdated = Objects.requireNonNull(sourceLastUpdated, "expected parameter 'sourceLastUpdated' to be non-null");
    }

    private ConnectorCollectionInfoResponse() {
        this.error = null;
        this.lastChecked = null;
        this.lastUpdated = null;
        this.sourceLastUpdated = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorCollectionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConnectorCollectionErrorInfoResponse error;
        private String lastChecked;
        private String lastUpdated;
        private String sourceLastUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorCollectionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.lastChecked = defaults.lastChecked;
    	      this.lastUpdated = defaults.lastUpdated;
    	      this.sourceLastUpdated = defaults.sourceLastUpdated;
        }

        public Builder setError(@Nullable ConnectorCollectionErrorInfoResponse error) {
            this.error = error;
            return this;
        }

        public Builder setLastChecked(String lastChecked) {
            this.lastChecked = Objects.requireNonNull(lastChecked);
            return this;
        }

        public Builder setLastUpdated(String lastUpdated) {
            this.lastUpdated = Objects.requireNonNull(lastUpdated);
            return this;
        }

        public Builder setSourceLastUpdated(String sourceLastUpdated) {
            this.sourceLastUpdated = Objects.requireNonNull(sourceLastUpdated);
            return this;
        }
        public ConnectorCollectionInfoResponse build() {
            return new ConnectorCollectionInfoResponse(error, lastChecked, lastUpdated, sourceLastUpdated);
        }
    }
}
