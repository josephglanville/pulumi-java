// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.ServiceReferenceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * WebhookClientConfig contains the information to make a TLS connection with the webhook.
 * 
 */
public final class WebhookClientConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebhookClientConfigArgs Empty = new WebhookClientConfigArgs();

    /**
     * caBundle is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.
     * 
     */
    @Import(name="caBundle")
      private final @Nullable Output<String> caBundle;

    public Output<String> getCaBundle() {
        return this.caBundle == null ? Output.empty() : this.caBundle;
    }

    /**
     * service is a reference to the service for this webhook. Either service or url must be specified.
     * 
     * If the webhook is running within the cluster, then you should use `service`.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<ServiceReferenceArgs> service;

    public Output<ServiceReferenceArgs> getService() {
        return this.service == null ? Output.empty() : this.service;
    }

    /**
     * url gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or `service` must be specified.
     * 
     * The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.
     * 
     * Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.
     * 
     * The scheme must be "https"; the URL must begin with "https://".
     * 
     * A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.
     * 
     * Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments ("#...") and query parameters ("?...") are not allowed, either.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> getUrl() {
        return this.url == null ? Output.empty() : this.url;
    }

    public WebhookClientConfigArgs(
        @Nullable Output<String> caBundle,
        @Nullable Output<ServiceReferenceArgs> service,
        @Nullable Output<String> url) {
        this.caBundle = caBundle;
        this.service = service;
        this.url = url;
    }

    private WebhookClientConfigArgs() {
        this.caBundle = Output.empty();
        this.service = Output.empty();
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookClientConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> caBundle;
        private @Nullable Output<ServiceReferenceArgs> service;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookClientConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caBundle = defaults.caBundle;
    	      this.service = defaults.service;
    	      this.url = defaults.url;
        }

        public Builder caBundle(@Nullable Output<String> caBundle) {
            this.caBundle = caBundle;
            return this;
        }
        public Builder caBundle(@Nullable String caBundle) {
            this.caBundle = Output.ofNullable(caBundle);
            return this;
        }
        public Builder service(@Nullable Output<ServiceReferenceArgs> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable ServiceReferenceArgs service) {
            this.service = Output.ofNullable(service);
            return this;
        }
        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Output.ofNullable(url);
            return this;
        }        public WebhookClientConfigArgs build() {
            return new WebhookClientConfigArgs(caBundle, service, url);
        }
    }
}
