// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.inputs.ContentLinkArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModuleArgs Empty = new ModuleArgs();

    @InputImport(name="automationAccountName", required=true)
    private final Input<String> automationAccountName;

    public Input<String> getAutomationAccountName() {
        return this.automationAccountName;
    }

    @InputImport(name="contentLink", required=true)
    private final Input<ContentLinkArgs> contentLink;

    public Input<ContentLinkArgs> getContentLink() {
        return this.contentLink;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="moduleName")
    private final @Nullable Input<String> moduleName;

    public Input<String> getModuleName() {
        return this.moduleName == null ? Input.empty() : this.moduleName;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ModuleArgs(
        Input<String> automationAccountName,
        Input<ContentLinkArgs> contentLink,
        @Nullable Input<String> location,
        @Nullable Input<String> moduleName,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.contentLink = Objects.requireNonNull(contentLink, "expected parameter 'contentLink' to be non-null");
        this.location = location;
        this.moduleName = moduleName;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ModuleArgs() {
        this.automationAccountName = Input.empty();
        this.contentLink = Input.empty();
        this.location = Input.empty();
        this.moduleName = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> automationAccountName;
        private Input<ContentLinkArgs> contentLink;
        private @Nullable Input<String> location;
        private @Nullable Input<String> moduleName;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

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

        public Builder setAutomationAccountName(Input<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Input.of(Objects.requireNonNull(automationAccountName));
            return this;
        }

        public Builder setContentLink(Input<ContentLinkArgs> contentLink) {
            this.contentLink = Objects.requireNonNull(contentLink);
            return this;
        }

        public Builder setContentLink(ContentLinkArgs contentLink) {
            this.contentLink = Input.of(Objects.requireNonNull(contentLink));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setModuleName(@Nullable Input<String> moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        public Builder setModuleName(@Nullable String moduleName) {
            this.moduleName = Input.ofNullable(moduleName);
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ModuleArgs build() {
            return new ModuleArgs(automationAccountName, contentLink, location, moduleName, name, resourceGroupName, tags);
        }
    }
}
