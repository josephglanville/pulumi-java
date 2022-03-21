// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ManagedZoneServiceDirectoryConfigNamespaceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedZoneServiceDirectoryConfigNamespaceResponse Empty = new ManagedZoneServiceDirectoryConfigNamespaceResponse();

    /**
     * The time that the namespace backing this zone was deleted; an empty string if it still exists. This is in RFC3339 text format. Output only.
     * 
     */
    @Import(name="deletionTime", required=true)
      private final String deletionTime;

    public String getDeletionTime() {
        return this.deletionTime;
    }

    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * The fully qualified URL of the namespace associated with the zone. Format must be https://servicedirectory.googleapis.com/v1/projects/{project}/locations/{location}/namespaces/{namespace}
     * 
     */
    @Import(name="namespaceUrl", required=true)
      private final String namespaceUrl;

    public String getNamespaceUrl() {
        return this.namespaceUrl;
    }

    public ManagedZoneServiceDirectoryConfigNamespaceResponse(
        String deletionTime,
        String kind,
        String namespaceUrl) {
        this.deletionTime = Objects.requireNonNull(deletionTime, "expected parameter 'deletionTime' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.namespaceUrl = Objects.requireNonNull(namespaceUrl, "expected parameter 'namespaceUrl' to be non-null");
    }

    private ManagedZoneServiceDirectoryConfigNamespaceResponse() {
        this.deletionTime = null;
        this.kind = null;
        this.namespaceUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneServiceDirectoryConfigNamespaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deletionTime;
        private String kind;
        private String namespaceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneServiceDirectoryConfigNamespaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deletionTime = defaults.deletionTime;
    	      this.kind = defaults.kind;
    	      this.namespaceUrl = defaults.namespaceUrl;
        }

        public Builder deletionTime(String deletionTime) {
            this.deletionTime = Objects.requireNonNull(deletionTime);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder namespaceUrl(String namespaceUrl) {
            this.namespaceUrl = Objects.requireNonNull(namespaceUrl);
            return this;
        }        public ManagedZoneServiceDirectoryConfigNamespaceResponse build() {
            return new ManagedZoneServiceDirectoryConfigNamespaceResponse(deletionTime, kind, namespaceUrl);
        }
    }
}
