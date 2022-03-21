// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dns_v1.inputs.ManagedZoneServiceDirectoryConfigNamespaceResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information about Service Directory-backed zones.
 * 
 */
public final class ManagedZoneServiceDirectoryConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedZoneServiceDirectoryConfigResponse Empty = new ManagedZoneServiceDirectoryConfigResponse();

    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Contains information about the namespace associated with the zone.
     * 
     */
    @Import(name="namespace", required=true)
      private final ManagedZoneServiceDirectoryConfigNamespaceResponse namespace;

    public ManagedZoneServiceDirectoryConfigNamespaceResponse getNamespace() {
        return this.namespace;
    }

    public ManagedZoneServiceDirectoryConfigResponse(
        String kind,
        ManagedZoneServiceDirectoryConfigNamespaceResponse namespace) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private ManagedZoneServiceDirectoryConfigResponse() {
        this.kind = null;
        this.namespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneServiceDirectoryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private ManagedZoneServiceDirectoryConfigNamespaceResponse namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneServiceDirectoryConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.namespace = defaults.namespace;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder namespace(ManagedZoneServiceDirectoryConfigNamespaceResponse namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }        public ManagedZoneServiceDirectoryConfigResponse build() {
            return new ManagedZoneServiceDirectoryConfigResponse(kind, namespace);
        }
    }
}
