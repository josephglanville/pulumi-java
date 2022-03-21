// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFolderResult {
    /**
     * Timestamp when the Organization was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    private final String createTime;
    /**
     * The folder's display name.
     * 
     */
    private final String displayName;
    private final String folder;
    private final String folderId;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The Folder's current lifecycle state.
     * 
     */
    private final String lifecycleState;
    private final @Nullable Boolean lookupOrganization;
    /**
     * The resource name of the Folder in the form `folders/{folder_id}`.
     * 
     */
    private final String name;
    /**
     * If `lookup_organization` is enable, the resource name of the Organization that the folder belongs.
     * 
     */
    private final String organization;
    /**
     * The resource name of the parent Folder or Organization.
     * 
     */
    private final String parent;

    @CustomType.Constructor
    private GetFolderResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("folder") String folder,
        @CustomType.Parameter("folderId") String folderId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lifecycleState") String lifecycleState,
        @CustomType.Parameter("lookupOrganization") @Nullable Boolean lookupOrganization,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("organization") String organization,
        @CustomType.Parameter("parent") String parent) {
        this.createTime = createTime;
        this.displayName = displayName;
        this.folder = folder;
        this.folderId = folderId;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.lookupOrganization = lookupOrganization;
        this.name = name;
        this.organization = organization;
        this.parent = parent;
    }

    /**
     * Timestamp when the Organization was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The folder's display name.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    public String getFolder() {
        return this.folder;
    }
    public String getFolderId() {
        return this.folderId;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The Folder's current lifecycle state.
     * 
    */
    public String getLifecycleState() {
        return this.lifecycleState;
    }
    public Optional<Boolean> getLookupOrganization() {
        return Optional.ofNullable(this.lookupOrganization);
    }
    /**
     * The resource name of the Folder in the form `folders/{folder_id}`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * If `lookup_organization` is enable, the resource name of the Organization that the folder belongs.
     * 
    */
    public String getOrganization() {
        return this.organization;
    }
    /**
     * The resource name of the parent Folder or Organization.
     * 
    */
    public String getParent() {
        return this.parent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFolderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String displayName;
        private String folder;
        private String folderId;
        private String id;
        private String lifecycleState;
        private @Nullable Boolean lookupOrganization;
        private String name;
        private String organization;
        private String parent;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFolderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.folder = defaults.folder;
    	      this.folderId = defaults.folderId;
    	      this.id = defaults.id;
    	      this.lifecycleState = defaults.lifecycleState;
    	      this.lookupOrganization = defaults.lookupOrganization;
    	      this.name = defaults.name;
    	      this.organization = defaults.organization;
    	      this.parent = defaults.parent;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder folder(String folder) {
            this.folder = Objects.requireNonNull(folder);
            return this;
        }
        public Builder folderId(String folderId) {
            this.folderId = Objects.requireNonNull(folderId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lifecycleState(String lifecycleState) {
            this.lifecycleState = Objects.requireNonNull(lifecycleState);
            return this;
        }
        public Builder lookupOrganization(@Nullable Boolean lookupOrganization) {
            this.lookupOrganization = lookupOrganization;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder organization(String organization) {
            this.organization = Objects.requireNonNull(organization);
            return this;
        }
        public Builder parent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }        public GetFolderResult build() {
            return new GetFolderResult(createTime, displayName, folder, folderId, id, lifecycleState, lookupOrganization, name, organization, parent);
        }
    }
}
