// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.inputs;

import io.pulumi.aws.workspaces.inputs.WorkspaceWorkspacePropertiesGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceState extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceState Empty = new WorkspaceState();

    /**
     * The ID of the bundle for the WorkSpace.
     * 
     */
    @Import(name="bundleId")
      private final @Nullable Output<String> bundleId;

    public Output<String> getBundleId() {
        return this.bundleId == null ? Output.empty() : this.bundleId;
    }

    /**
     * The name of the WorkSpace, as seen by the operating system.
     * 
     */
    @Import(name="computerName")
      private final @Nullable Output<String> computerName;

    public Output<String> getComputerName() {
        return this.computerName == null ? Output.empty() : this.computerName;
    }

    /**
     * The ID of the directory for the WorkSpace.
     * 
     */
    @Import(name="directoryId")
      private final @Nullable Output<String> directoryId;

    public Output<String> getDirectoryId() {
        return this.directoryId == null ? Output.empty() : this.directoryId;
    }

    /**
     * The IP address of the WorkSpace.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Output.empty() : this.ipAddress;
    }

    /**
     * Indicates whether the data stored on the root volume is encrypted.
     * 
     */
    @Import(name="rootVolumeEncryptionEnabled")
      private final @Nullable Output<Boolean> rootVolumeEncryptionEnabled;

    public Output<Boolean> getRootVolumeEncryptionEnabled() {
        return this.rootVolumeEncryptionEnabled == null ? Output.empty() : this.rootVolumeEncryptionEnabled;
    }

    /**
     * The operational state of the WorkSpace.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * The tags for the WorkSpace. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * The user name of the user for the WorkSpace. This user name must exist in the directory for the WorkSpace.
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<String> userName;

    public Output<String> getUserName() {
        return this.userName == null ? Output.empty() : this.userName;
    }

    /**
     * Indicates whether the data stored on the user volume is encrypted.
     * 
     */
    @Import(name="userVolumeEncryptionEnabled")
      private final @Nullable Output<Boolean> userVolumeEncryptionEnabled;

    public Output<Boolean> getUserVolumeEncryptionEnabled() {
        return this.userVolumeEncryptionEnabled == null ? Output.empty() : this.userVolumeEncryptionEnabled;
    }

    /**
     * The symmetric AWS KMS customer master key (CMK) used to encrypt data stored on your WorkSpace. Amazon WorkSpaces does not support asymmetric CMKs.
     * 
     */
    @Import(name="volumeEncryptionKey")
      private final @Nullable Output<String> volumeEncryptionKey;

    public Output<String> getVolumeEncryptionKey() {
        return this.volumeEncryptionKey == null ? Output.empty() : this.volumeEncryptionKey;
    }

    /**
     * The WorkSpace properties.
     * 
     */
    @Import(name="workspaceProperties")
      private final @Nullable Output<WorkspaceWorkspacePropertiesGetArgs> workspaceProperties;

    public Output<WorkspaceWorkspacePropertiesGetArgs> getWorkspaceProperties() {
        return this.workspaceProperties == null ? Output.empty() : this.workspaceProperties;
    }

    public WorkspaceState(
        @Nullable Output<String> bundleId,
        @Nullable Output<String> computerName,
        @Nullable Output<String> directoryId,
        @Nullable Output<String> ipAddress,
        @Nullable Output<Boolean> rootVolumeEncryptionEnabled,
        @Nullable Output<String> state,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> userName,
        @Nullable Output<Boolean> userVolumeEncryptionEnabled,
        @Nullable Output<String> volumeEncryptionKey,
        @Nullable Output<WorkspaceWorkspacePropertiesGetArgs> workspaceProperties) {
        this.bundleId = bundleId;
        this.computerName = computerName;
        this.directoryId = directoryId;
        this.ipAddress = ipAddress;
        this.rootVolumeEncryptionEnabled = rootVolumeEncryptionEnabled;
        this.state = state;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.userName = userName;
        this.userVolumeEncryptionEnabled = userVolumeEncryptionEnabled;
        this.volumeEncryptionKey = volumeEncryptionKey;
        this.workspaceProperties = workspaceProperties;
    }

    private WorkspaceState() {
        this.bundleId = Output.empty();
        this.computerName = Output.empty();
        this.directoryId = Output.empty();
        this.ipAddress = Output.empty();
        this.rootVolumeEncryptionEnabled = Output.empty();
        this.state = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.userName = Output.empty();
        this.userVolumeEncryptionEnabled = Output.empty();
        this.volumeEncryptionKey = Output.empty();
        this.workspaceProperties = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bundleId;
        private @Nullable Output<String> computerName;
        private @Nullable Output<String> directoryId;
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<Boolean> rootVolumeEncryptionEnabled;
        private @Nullable Output<String> state;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> userName;
        private @Nullable Output<Boolean> userVolumeEncryptionEnabled;
        private @Nullable Output<String> volumeEncryptionKey;
        private @Nullable Output<WorkspaceWorkspacePropertiesGetArgs> workspaceProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleId = defaults.bundleId;
    	      this.computerName = defaults.computerName;
    	      this.directoryId = defaults.directoryId;
    	      this.ipAddress = defaults.ipAddress;
    	      this.rootVolumeEncryptionEnabled = defaults.rootVolumeEncryptionEnabled;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.userName = defaults.userName;
    	      this.userVolumeEncryptionEnabled = defaults.userVolumeEncryptionEnabled;
    	      this.volumeEncryptionKey = defaults.volumeEncryptionKey;
    	      this.workspaceProperties = defaults.workspaceProperties;
        }

        public Builder bundleId(@Nullable Output<String> bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public Builder bundleId(@Nullable String bundleId) {
            this.bundleId = Output.ofNullable(bundleId);
            return this;
        }
        public Builder computerName(@Nullable Output<String> computerName) {
            this.computerName = computerName;
            return this;
        }
        public Builder computerName(@Nullable String computerName) {
            this.computerName = Output.ofNullable(computerName);
            return this;
        }
        public Builder directoryId(@Nullable Output<String> directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public Builder directoryId(@Nullable String directoryId) {
            this.directoryId = Output.ofNullable(directoryId);
            return this;
        }
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Output.ofNullable(ipAddress);
            return this;
        }
        public Builder rootVolumeEncryptionEnabled(@Nullable Output<Boolean> rootVolumeEncryptionEnabled) {
            this.rootVolumeEncryptionEnabled = rootVolumeEncryptionEnabled;
            return this;
        }
        public Builder rootVolumeEncryptionEnabled(@Nullable Boolean rootVolumeEncryptionEnabled) {
            this.rootVolumeEncryptionEnabled = Output.ofNullable(rootVolumeEncryptionEnabled);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public Builder userName(@Nullable Output<String> userName) {
            this.userName = userName;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = Output.ofNullable(userName);
            return this;
        }
        public Builder userVolumeEncryptionEnabled(@Nullable Output<Boolean> userVolumeEncryptionEnabled) {
            this.userVolumeEncryptionEnabled = userVolumeEncryptionEnabled;
            return this;
        }
        public Builder userVolumeEncryptionEnabled(@Nullable Boolean userVolumeEncryptionEnabled) {
            this.userVolumeEncryptionEnabled = Output.ofNullable(userVolumeEncryptionEnabled);
            return this;
        }
        public Builder volumeEncryptionKey(@Nullable Output<String> volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }
        public Builder volumeEncryptionKey(@Nullable String volumeEncryptionKey) {
            this.volumeEncryptionKey = Output.ofNullable(volumeEncryptionKey);
            return this;
        }
        public Builder workspaceProperties(@Nullable Output<WorkspaceWorkspacePropertiesGetArgs> workspaceProperties) {
            this.workspaceProperties = workspaceProperties;
            return this;
        }
        public Builder workspaceProperties(@Nullable WorkspaceWorkspacePropertiesGetArgs workspaceProperties) {
            this.workspaceProperties = Output.ofNullable(workspaceProperties);
            return this;
        }        public WorkspaceState build() {
            return new WorkspaceState(bundleId, computerName, directoryId, ipAddress, rootVolumeEncryptionEnabled, state, tags, tagsAll, userName, userVolumeEncryptionEnabled, volumeEncryptionKey, workspaceProperties);
        }
    }
}
