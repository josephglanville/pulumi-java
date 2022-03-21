// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for a Cloud Run network endpoint group (NEG). The service must be provided explicitly or in the URL mask. The tag is optional, may be provided explicitly or in the URL mask. Note: Cloud Run service must be in the same project and located in the same region as the Serverless NEG.
 * 
 */
public final class NetworkEndpointGroupCloudRunArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkEndpointGroupCloudRunArgs Empty = new NetworkEndpointGroupCloudRunArgs();

    /**
     * Cloud Run service is the main resource of Cloud Run. The service must be 1-63 characters long, and comply with RFC1035. Example value: "run-service".
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> getService() {
        return this.service == null ? Output.empty() : this.service;
    }

    /**
     * Optional Cloud Run tag represents the "named-revision" to provide additional fine-grained traffic routing information. The tag must be 1-63 characters long, and comply with RFC1035. Example value: "revision-0010".
     * 
     */
    @Import(name="tag")
      private final @Nullable Output<String> tag;

    public Output<String> getTag() {
        return this.tag == null ? Output.empty() : this.tag;
    }

    /**
     * A template to parse service and tag fields from a request URL. URL mask allows for routing to multiple Run services without having to create multiple network endpoint groups and backend services. For example, request URLs "foo1.domain.com/bar1" and "foo1.domain.com/bar2" can be backed by the same Serverless Network Endpoint Group (NEG) with URL mask ".domain.com/". The URL mask will parse them to { service="bar1", tag="foo1" } and { service="bar2", tag="foo2" } respectively.
     * 
     */
    @Import(name="urlMask")
      private final @Nullable Output<String> urlMask;

    public Output<String> getUrlMask() {
        return this.urlMask == null ? Output.empty() : this.urlMask;
    }

    public NetworkEndpointGroupCloudRunArgs(
        @Nullable Output<String> service,
        @Nullable Output<String> tag,
        @Nullable Output<String> urlMask) {
        this.service = service;
        this.tag = tag;
        this.urlMask = urlMask;
    }

    private NetworkEndpointGroupCloudRunArgs() {
        this.service = Output.empty();
        this.tag = Output.empty();
        this.urlMask = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointGroupCloudRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> service;
        private @Nullable Output<String> tag;
        private @Nullable Output<String> urlMask;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointGroupCloudRunArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
    	      this.tag = defaults.tag;
    	      this.urlMask = defaults.urlMask;
        }

        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Output.ofNullable(service);
            return this;
        }
        public Builder tag(@Nullable Output<String> tag) {
            this.tag = tag;
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = Output.ofNullable(tag);
            return this;
        }
        public Builder urlMask(@Nullable Output<String> urlMask) {
            this.urlMask = urlMask;
            return this;
        }
        public Builder urlMask(@Nullable String urlMask) {
            this.urlMask = Output.ofNullable(urlMask);
            return this;
        }        public NetworkEndpointGroupCloudRunArgs build() {
            return new NetworkEndpointGroupCloudRunArgs(service, tag, urlMask);
        }
    }
}
