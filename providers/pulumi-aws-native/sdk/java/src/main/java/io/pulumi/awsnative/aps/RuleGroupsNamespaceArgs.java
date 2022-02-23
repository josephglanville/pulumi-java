// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.aps;

import io.pulumi.awsnative.aps.inputs.RuleGroupsNamespaceTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupsNamespaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupsNamespaceArgs Empty = new RuleGroupsNamespaceArgs();

    /**
     * The RuleGroupsNamespace data.
     * 
     */
    @InputImport(name="data", required=true)
      private final Input<String> data;

    public Input<String> getData() {
        return this.data;
    }

    /**
     * The RuleGroupsNamespace name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<RuleGroupsNamespaceTagArgs>> tags;

    public Input<List<RuleGroupsNamespaceTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Required to identify a specific APS Workspace associated with this RuleGroupsNamespace.
     * 
     */
    @InputImport(name="workspace", required=true)
      private final Input<String> workspace;

    public Input<String> getWorkspace() {
        return this.workspace;
    }

    public RuleGroupsNamespaceArgs(
        Input<String> data,
        @Nullable Input<String> name,
        @Nullable Input<List<RuleGroupsNamespaceTagArgs>> tags,
        Input<String> workspace) {
        this.data = Objects.requireNonNull(data, "expected parameter 'data' to be non-null");
        this.name = name;
        this.tags = tags;
        this.workspace = Objects.requireNonNull(workspace, "expected parameter 'workspace' to be non-null");
    }

    private RuleGroupsNamespaceArgs() {
        this.data = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
        this.workspace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupsNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> data;
        private @Nullable Input<String> name;
        private @Nullable Input<List<RuleGroupsNamespaceTagArgs>> tags;
        private Input<String> workspace;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupsNamespaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.workspace = defaults.workspace;
        }

        public Builder setData(Input<String> data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }

        public Builder setData(String data) {
            this.data = Input.of(Objects.requireNonNull(data));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTags(@Nullable Input<List<RuleGroupsNamespaceTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<RuleGroupsNamespaceTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setWorkspace(Input<String> workspace) {
            this.workspace = Objects.requireNonNull(workspace);
            return this;
        }

        public Builder setWorkspace(String workspace) {
            this.workspace = Input.of(Objects.requireNonNull(workspace));
            return this;
        }
        public RuleGroupsNamespaceArgs build() {
            return new RuleGroupsNamespaceArgs(data, name, tags, workspace);
        }
    }
}
