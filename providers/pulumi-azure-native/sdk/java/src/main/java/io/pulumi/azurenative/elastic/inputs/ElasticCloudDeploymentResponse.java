// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ElasticCloudDeploymentResponse extends io.pulumi.resources.InvokeArgs {

    public static final ElasticCloudDeploymentResponse Empty = new ElasticCloudDeploymentResponse();

    @InputImport(name="azureSubscriptionId", required=true)
    private final String azureSubscriptionId;

    public String getAzureSubscriptionId() {
        return this.azureSubscriptionId;
    }

    @InputImport(name="deploymentId", required=true)
    private final String deploymentId;

    public String getDeploymentId() {
        return this.deploymentId;
    }

    @InputImport(name="elasticsearchRegion", required=true)
    private final String elasticsearchRegion;

    public String getElasticsearchRegion() {
        return this.elasticsearchRegion;
    }

    @InputImport(name="elasticsearchServiceUrl", required=true)
    private final String elasticsearchServiceUrl;

    public String getElasticsearchServiceUrl() {
        return this.elasticsearchServiceUrl;
    }

    @InputImport(name="kibanaServiceUrl", required=true)
    private final String kibanaServiceUrl;

    public String getKibanaServiceUrl() {
        return this.kibanaServiceUrl;
    }

    @InputImport(name="kibanaSsoUrl", required=true)
    private final String kibanaSsoUrl;

    public String getKibanaSsoUrl() {
        return this.kibanaSsoUrl;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    public ElasticCloudDeploymentResponse(
        String azureSubscriptionId,
        String deploymentId,
        String elasticsearchRegion,
        String elasticsearchServiceUrl,
        String kibanaServiceUrl,
        String kibanaSsoUrl,
        String name) {
        this.azureSubscriptionId = Objects.requireNonNull(azureSubscriptionId, "expected parameter 'azureSubscriptionId' to be non-null");
        this.deploymentId = Objects.requireNonNull(deploymentId, "expected parameter 'deploymentId' to be non-null");
        this.elasticsearchRegion = Objects.requireNonNull(elasticsearchRegion, "expected parameter 'elasticsearchRegion' to be non-null");
        this.elasticsearchServiceUrl = Objects.requireNonNull(elasticsearchServiceUrl, "expected parameter 'elasticsearchServiceUrl' to be non-null");
        this.kibanaServiceUrl = Objects.requireNonNull(kibanaServiceUrl, "expected parameter 'kibanaServiceUrl' to be non-null");
        this.kibanaSsoUrl = Objects.requireNonNull(kibanaSsoUrl, "expected parameter 'kibanaSsoUrl' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ElasticCloudDeploymentResponse() {
        this.azureSubscriptionId = null;
        this.deploymentId = null;
        this.elasticsearchRegion = null;
        this.elasticsearchServiceUrl = null;
        this.kibanaServiceUrl = null;
        this.kibanaSsoUrl = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElasticCloudDeploymentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String azureSubscriptionId;
        private String deploymentId;
        private String elasticsearchRegion;
        private String elasticsearchServiceUrl;
        private String kibanaServiceUrl;
        private String kibanaSsoUrl;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ElasticCloudDeploymentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureSubscriptionId = defaults.azureSubscriptionId;
    	      this.deploymentId = defaults.deploymentId;
    	      this.elasticsearchRegion = defaults.elasticsearchRegion;
    	      this.elasticsearchServiceUrl = defaults.elasticsearchServiceUrl;
    	      this.kibanaServiceUrl = defaults.kibanaServiceUrl;
    	      this.kibanaSsoUrl = defaults.kibanaSsoUrl;
    	      this.name = defaults.name;
        }

        public Builder setAzureSubscriptionId(String azureSubscriptionId) {
            this.azureSubscriptionId = Objects.requireNonNull(azureSubscriptionId);
            return this;
        }

        public Builder setDeploymentId(String deploymentId) {
            this.deploymentId = Objects.requireNonNull(deploymentId);
            return this;
        }

        public Builder setElasticsearchRegion(String elasticsearchRegion) {
            this.elasticsearchRegion = Objects.requireNonNull(elasticsearchRegion);
            return this;
        }

        public Builder setElasticsearchServiceUrl(String elasticsearchServiceUrl) {
            this.elasticsearchServiceUrl = Objects.requireNonNull(elasticsearchServiceUrl);
            return this;
        }

        public Builder setKibanaServiceUrl(String kibanaServiceUrl) {
            this.kibanaServiceUrl = Objects.requireNonNull(kibanaServiceUrl);
            return this;
        }

        public Builder setKibanaSsoUrl(String kibanaSsoUrl) {
            this.kibanaSsoUrl = Objects.requireNonNull(kibanaSsoUrl);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public ElasticCloudDeploymentResponse build() {
            return new ElasticCloudDeploymentResponse(azureSubscriptionId, deploymentId, elasticsearchRegion, elasticsearchServiceUrl, kibanaServiceUrl, kibanaSsoUrl, name);
        }
    }
}
