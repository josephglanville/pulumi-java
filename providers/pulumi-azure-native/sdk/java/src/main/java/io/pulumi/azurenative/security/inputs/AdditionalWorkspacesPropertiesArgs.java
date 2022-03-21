// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.enums.AdditionalWorkspaceDataType;
import io.pulumi.azurenative.security.enums.AdditionalWorkspaceType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the additional workspaces.
 * 
 */
public final class AdditionalWorkspacesPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdditionalWorkspacesPropertiesArgs Empty = new AdditionalWorkspacesPropertiesArgs();

    /**
     * List of data types sent to workspace
     * 
     */
    @Import(name="dataTypes")
      private final @Nullable Output<List<Either<String,AdditionalWorkspaceDataType>>> dataTypes;

    public Output<List<Either<String,AdditionalWorkspaceDataType>>> getDataTypes() {
        return this.dataTypes == null ? Output.empty() : this.dataTypes;
    }

    /**
     * Workspace type.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,AdditionalWorkspaceType>> type;

    public Output<Either<String,AdditionalWorkspaceType>> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * Workspace resource id
     * 
     */
    @Import(name="workspace")
      private final @Nullable Output<String> workspace;

    public Output<String> getWorkspace() {
        return this.workspace == null ? Output.empty() : this.workspace;
    }

    public AdditionalWorkspacesPropertiesArgs(
        @Nullable Output<List<Either<String,AdditionalWorkspaceDataType>>> dataTypes,
        @Nullable Output<Either<String,AdditionalWorkspaceType>> type,
        @Nullable Output<String> workspace) {
        this.dataTypes = dataTypes;
        this.type = type == null ? Output.ofLeft("Sentinel") : type;
        this.workspace = workspace;
    }

    private AdditionalWorkspacesPropertiesArgs() {
        this.dataTypes = Output.empty();
        this.type = Output.empty();
        this.workspace = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdditionalWorkspacesPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Either<String,AdditionalWorkspaceDataType>>> dataTypes;
        private @Nullable Output<Either<String,AdditionalWorkspaceType>> type;
        private @Nullable Output<String> workspace;

        public Builder() {
    	      // Empty
        }

        public Builder(AdditionalWorkspacesPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataTypes = defaults.dataTypes;
    	      this.type = defaults.type;
    	      this.workspace = defaults.workspace;
        }

        public Builder dataTypes(@Nullable Output<List<Either<String,AdditionalWorkspaceDataType>>> dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }
        public Builder dataTypes(@Nullable List<Either<String,AdditionalWorkspaceDataType>> dataTypes) {
            this.dataTypes = Output.ofNullable(dataTypes);
            return this;
        }
        public Builder dataTypes(Either<String,AdditionalWorkspaceDataType>... dataTypes) {
            return dataTypes(List.of(dataTypes));
        }
        public Builder type(@Nullable Output<Either<String,AdditionalWorkspaceType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,AdditionalWorkspaceType> type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public Builder workspace(@Nullable Output<String> workspace) {
            this.workspace = workspace;
            return this;
        }
        public Builder workspace(@Nullable String workspace) {
            this.workspace = Output.ofNullable(workspace);
            return this;
        }        public AdditionalWorkspacesPropertiesArgs build() {
            return new AdditionalWorkspacesPropertiesArgs(dataTypes, type, workspace);
        }
    }
}
