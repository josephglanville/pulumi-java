// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.ResourceIdentityResponse;
import io.pulumi.azurenative.sql.outputs.ServerExternalAdministratorResponse;
import io.pulumi.azurenative.sql.outputs.ServerPrivateEndpointConnectionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetServerResult {
    private final @Nullable String administratorLogin;
    private final @Nullable ServerExternalAdministratorResponse administrators;
    private final String fullyQualifiedDomainName;
    private final String id;
    private final @Nullable ResourceIdentityResponse identity;
    private final @Nullable String keyId;
    private final String kind;
    private final String location;
    private final @Nullable String minimalTlsVersion;
    private final String name;
    private final @Nullable String primaryUserAssignedIdentityId;
    private final List<ServerPrivateEndpointConnectionResponse> privateEndpointConnections;
    private final @Nullable String publicNetworkAccess;
    private final String state;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final @Nullable String version;
    private final String workspaceFeature;

    @OutputCustomType.Constructor({"administratorLogin","administrators","fullyQualifiedDomainName","id","identity","keyId","kind","location","minimalTlsVersion","name","primaryUserAssignedIdentityId","privateEndpointConnections","publicNetworkAccess","state","tags","type","version","workspaceFeature"})
    private GetServerResult(
        @Nullable String administratorLogin,
        @Nullable ServerExternalAdministratorResponse administrators,
        String fullyQualifiedDomainName,
        String id,
        @Nullable ResourceIdentityResponse identity,
        @Nullable String keyId,
        String kind,
        String location,
        @Nullable String minimalTlsVersion,
        String name,
        @Nullable String primaryUserAssignedIdentityId,
        List<ServerPrivateEndpointConnectionResponse> privateEndpointConnections,
        @Nullable String publicNetworkAccess,
        String state,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable String version,
        String workspaceFeature) {
        this.administratorLogin = administratorLogin;
        this.administrators = administrators;
        this.fullyQualifiedDomainName = Objects.requireNonNull(fullyQualifiedDomainName);
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.keyId = keyId;
        this.kind = Objects.requireNonNull(kind);
        this.location = Objects.requireNonNull(location);
        this.minimalTlsVersion = minimalTlsVersion;
        this.name = Objects.requireNonNull(name);
        this.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
        this.publicNetworkAccess = publicNetworkAccess;
        this.state = Objects.requireNonNull(state);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.version = version;
        this.workspaceFeature = Objects.requireNonNull(workspaceFeature);
    }

    public Optional<String> getAdministratorLogin() {
        return Optional.ofNullable(this.administratorLogin);
    }
    public Optional<ServerExternalAdministratorResponse> getAdministrators() {
        return Optional.ofNullable(this.administrators);
    }
    public String getFullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }
    public String getId() {
        return this.id;
    }
    public Optional<ResourceIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    public Optional<String> getKeyId() {
        return Optional.ofNullable(this.keyId);
    }
    public String getKind() {
        return this.kind;
    }
    public String getLocation() {
        return this.location;
    }
    public Optional<String> getMinimalTlsVersion() {
        return Optional.ofNullable(this.minimalTlsVersion);
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getPrimaryUserAssignedIdentityId() {
        return Optional.ofNullable(this.primaryUserAssignedIdentityId);
    }
    public List<ServerPrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    public String getState() {
        return this.state;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }
    public String getWorkspaceFeature() {
        return this.workspaceFeature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String administratorLogin;
        private @Nullable ServerExternalAdministratorResponse administrators;
        private String fullyQualifiedDomainName;
        private String id;
        private @Nullable ResourceIdentityResponse identity;
        private @Nullable String keyId;
        private String kind;
        private String location;
        private @Nullable String minimalTlsVersion;
        private String name;
        private @Nullable String primaryUserAssignedIdentityId;
        private List<ServerPrivateEndpointConnectionResponse> privateEndpointConnections;
        private @Nullable String publicNetworkAccess;
        private String state;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String version;
        private String workspaceFeature;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorLogin = defaults.administratorLogin;
    	      this.administrators = defaults.administrators;
    	      this.fullyQualifiedDomainName = defaults.fullyQualifiedDomainName;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.keyId = defaults.keyId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.minimalTlsVersion = defaults.minimalTlsVersion;
    	      this.name = defaults.name;
    	      this.primaryUserAssignedIdentityId = defaults.primaryUserAssignedIdentityId;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
    	      this.workspaceFeature = defaults.workspaceFeature;
        }

        public Builder setAdministratorLogin(@Nullable String administratorLogin) {
            this.administratorLogin = administratorLogin;
            return this;
        }

        public Builder setAdministrators(@Nullable ServerExternalAdministratorResponse administrators) {
            this.administrators = administrators;
            return this;
        }

        public Builder setFullyQualifiedDomainName(String fullyQualifiedDomainName) {
            this.fullyQualifiedDomainName = Objects.requireNonNull(fullyQualifiedDomainName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ResourceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setKeyId(@Nullable String keyId) {
            this.keyId = keyId;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMinimalTlsVersion(@Nullable String minimalTlsVersion) {
            this.minimalTlsVersion = minimalTlsVersion;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrimaryUserAssignedIdentityId(@Nullable String primaryUserAssignedIdentityId) {
            this.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
            return this;
        }

        public Builder setPrivateEndpointConnections(List<ServerPrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public Builder setWorkspaceFeature(String workspaceFeature) {
            this.workspaceFeature = Objects.requireNonNull(workspaceFeature);
            return this;
        }

        public GetServerResult build() {
            return new GetServerResult(administratorLogin, administrators, fullyQualifiedDomainName, id, identity, keyId, kind, location, minimalTlsVersion, name, primaryUserAssignedIdentityId, privateEndpointConnections, publicNetworkAccess, state, tags, type, version, workspaceFeature);
        }
    }
}