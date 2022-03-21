// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.inputs.ContentLinkArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModuleArgs Empty = new ModuleArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
      private final Output<String> automationAccountName;

    public Output<String> getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Gets or sets the module content link.
     * 
     */
    @Import(name="contentLink", required=true)
      private final Output<ContentLinkArgs> contentLink;

    public Output<ContentLinkArgs> getContentLink() {
        return this.contentLink;
    }

    /**
     * Gets or sets the location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of module.
     * 
     */
    @Import(name="moduleName")
      private final @Nullable Output<String> moduleName;

    public Output<String> getModuleName() {
        return this.moduleName == null ? Output.empty() : this.moduleName;
    }

    /**
     * Gets or sets name of the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the tags attached to the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ModuleArgs(
        Output<String> automationAccountName,
        Output<ContentLinkArgs> contentLink,
        @Nullable Output<String> location,
        @Nullable Output<String> moduleName,
        @Nullable Output<String> name,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.contentLink = Objects.requireNonNull(contentLink, "expected parameter 'contentLink' to be non-null");
        this.location = location;
        this.moduleName = moduleName;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ModuleArgs() {
        this.automationAccountName = Output.empty();
        this.contentLink = Output.empty();
        this.location = Output.empty();
        this.moduleName = Output.empty();
        this.name = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> automationAccountName;
        private Output<ContentLinkArgs> contentLink;
        private @Nullable Output<String> location;
        private @Nullable Output<String> moduleName;
        private @Nullable Output<String> name;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ModuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.contentLink = defaults.contentLink;
    	      this.location = defaults.location;
    	      this.moduleName = defaults.moduleName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder automationAccountName(Output<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }
        public Builder automationAccountName(String automationAccountName) {
            this.automationAccountName = Output.of(Objects.requireNonNull(automationAccountName));
            return this;
        }
        public Builder contentLink(Output<ContentLinkArgs> contentLink) {
            this.contentLink = Objects.requireNonNull(contentLink);
            return this;
        }
        public Builder contentLink(ContentLinkArgs contentLink) {
            this.contentLink = Output.of(Objects.requireNonNull(contentLink));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder moduleName(@Nullable Output<String> moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public Builder moduleName(@Nullable String moduleName) {
            this.moduleName = Output.ofNullable(moduleName);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public ModuleArgs build() {
            return new ModuleArgs(automationAccountName, contentLink, location, moduleName, name, resourceGroupName, tags);
        }
    }
}
