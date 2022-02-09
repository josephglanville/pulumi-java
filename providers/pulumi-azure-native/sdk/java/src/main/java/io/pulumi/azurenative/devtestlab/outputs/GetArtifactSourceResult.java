// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetArtifactSourceResult {
    private final @Nullable String armTemplateFolderPath;
    private final @Nullable String branchRef;
    private final String createdDate;
    private final @Nullable String displayName;
    private final @Nullable String folderPath;
    private final String id;
    private final @Nullable String location;
    private final String name;
    private final String provisioningState;
    private final @Nullable String securityToken;
    private final @Nullable String sourceType;
    private final @Nullable String status;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final String uniqueIdentifier;
    private final @Nullable String uri;

    @OutputCustomType.Constructor({"armTemplateFolderPath","branchRef","createdDate","displayName","folderPath","id","location","name","provisioningState","securityToken","sourceType","status","tags","type","uniqueIdentifier","uri"})
    private GetArtifactSourceResult(
        @Nullable String armTemplateFolderPath,
        @Nullable String branchRef,
        String createdDate,
        @Nullable String displayName,
        @Nullable String folderPath,
        String id,
        @Nullable String location,
        String name,
        String provisioningState,
        @Nullable String securityToken,
        @Nullable String sourceType,
        @Nullable String status,
        @Nullable Map<String,String> tags,
        String type,
        String uniqueIdentifier,
        @Nullable String uri) {
        this.armTemplateFolderPath = armTemplateFolderPath;
        this.branchRef = branchRef;
        this.createdDate = Objects.requireNonNull(createdDate);
        this.displayName = displayName;
        this.folderPath = folderPath;
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.securityToken = securityToken;
        this.sourceType = sourceType;
        this.status = status;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
        this.uri = uri;
    }

    public Optional<String> getArmTemplateFolderPath() {
        return Optional.ofNullable(this.armTemplateFolderPath);
    }
    public Optional<String> getBranchRef() {
        return Optional.ofNullable(this.branchRef);
    }
    public String getCreatedDate() {
        return this.createdDate;
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    public Optional<String> getFolderPath() {
        return Optional.ofNullable(this.folderPath);
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getSecurityToken() {
        return Optional.ofNullable(this.securityToken);
    }
    public Optional<String> getSourceType() {
        return Optional.ofNullable(this.sourceType);
    }
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public String getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }
    public Optional<String> getUri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetArtifactSourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String armTemplateFolderPath;
        private @Nullable String branchRef;
        private String createdDate;
        private @Nullable String displayName;
        private @Nullable String folderPath;
        private String id;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private @Nullable String securityToken;
        private @Nullable String sourceType;
        private @Nullable String status;
        private @Nullable Map<String,String> tags;
        private String type;
        private String uniqueIdentifier;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetArtifactSourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.armTemplateFolderPath = defaults.armTemplateFolderPath;
    	      this.branchRef = defaults.branchRef;
    	      this.createdDate = defaults.createdDate;
    	      this.displayName = defaults.displayName;
    	      this.folderPath = defaults.folderPath;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.securityToken = defaults.securityToken;
    	      this.sourceType = defaults.sourceType;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
    	      this.uri = defaults.uri;
        }

        public Builder setArmTemplateFolderPath(@Nullable String armTemplateFolderPath) {
            this.armTemplateFolderPath = armTemplateFolderPath;
            return this;
        }

        public Builder setBranchRef(@Nullable String branchRef) {
            this.branchRef = branchRef;
            return this;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setFolderPath(@Nullable String folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSecurityToken(@Nullable String securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        public Builder setSourceType(@Nullable String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
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

        public Builder setUniqueIdentifier(String uniqueIdentifier) {
            this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }

        public GetArtifactSourceResult build() {
            return new GetArtifactSourceResult(armTemplateFolderPath, branchRef, createdDate, displayName, folderPath, id, location, name, provisioningState, securityToken, sourceType, status, tags, type, uniqueIdentifier, uri);
        }
    }
}
