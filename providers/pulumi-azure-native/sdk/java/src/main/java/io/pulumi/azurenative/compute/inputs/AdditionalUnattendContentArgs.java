// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.ComponentNames;
import io.pulumi.azurenative.compute.enums.PassNames;
import io.pulumi.azurenative.compute.enums.SettingNames;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies additional XML formatted information that can be included in the Unattend.xml file, which is used by Windows Setup. Contents are defined by setting name, component name, and the pass in which the content is applied.
 * 
 */
public final class AdditionalUnattendContentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdditionalUnattendContentArgs Empty = new AdditionalUnattendContentArgs();

    /**
     * The component name. Currently, the only allowable value is Microsoft-Windows-Shell-Setup.
     * 
     */
    @InputImport(name="componentName")
      private final @Nullable Input<ComponentNames> componentName;

    public Input<ComponentNames> getComponentName() {
        return this.componentName == null ? Input.empty() : this.componentName;
    }

    /**
     * Specifies the XML formatted content that is added to the unattend.xml file for the specified path and component. The XML must be less than 4KB and must include the root element for the setting or feature that is being inserted.
     * 
     */
    @InputImport(name="content")
      private final @Nullable Input<String> content;

    public Input<String> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    /**
     * The pass name. Currently, the only allowable value is OobeSystem.
     * 
     */
    @InputImport(name="passName")
      private final @Nullable Input<PassNames> passName;

    public Input<PassNames> getPassName() {
        return this.passName == null ? Input.empty() : this.passName;
    }

    /**
     * Specifies the name of the setting to which the content applies. Possible values are: FirstLogonCommands and AutoLogon.
     * 
     */
    @InputImport(name="settingName")
      private final @Nullable Input<SettingNames> settingName;

    public Input<SettingNames> getSettingName() {
        return this.settingName == null ? Input.empty() : this.settingName;
    }

    public AdditionalUnattendContentArgs(
        @Nullable Input<ComponentNames> componentName,
        @Nullable Input<String> content,
        @Nullable Input<PassNames> passName,
        @Nullable Input<SettingNames> settingName) {
        this.componentName = componentName;
        this.content = content;
        this.passName = passName;
        this.settingName = settingName;
    }

    private AdditionalUnattendContentArgs() {
        this.componentName = Input.empty();
        this.content = Input.empty();
        this.passName = Input.empty();
        this.settingName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdditionalUnattendContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ComponentNames> componentName;
        private @Nullable Input<String> content;
        private @Nullable Input<PassNames> passName;
        private @Nullable Input<SettingNames> settingName;

        public Builder() {
    	      // Empty
        }

        public Builder(AdditionalUnattendContentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentName = defaults.componentName;
    	      this.content = defaults.content;
    	      this.passName = defaults.passName;
    	      this.settingName = defaults.settingName;
        }

        public Builder setComponentName(@Nullable Input<ComponentNames> componentName) {
            this.componentName = componentName;
            return this;
        }

        public Builder setComponentName(@Nullable ComponentNames componentName) {
            this.componentName = Input.ofNullable(componentName);
            return this;
        }

        public Builder setContent(@Nullable Input<String> content) {
            this.content = content;
            return this;
        }

        public Builder setContent(@Nullable String content) {
            this.content = Input.ofNullable(content);
            return this;
        }

        public Builder setPassName(@Nullable Input<PassNames> passName) {
            this.passName = passName;
            return this;
        }

        public Builder setPassName(@Nullable PassNames passName) {
            this.passName = Input.ofNullable(passName);
            return this;
        }

        public Builder setSettingName(@Nullable Input<SettingNames> settingName) {
            this.settingName = settingName;
            return this;
        }

        public Builder setSettingName(@Nullable SettingNames settingName) {
            this.settingName = Input.ofNullable(settingName);
            return this;
        }
        public AdditionalUnattendContentArgs build() {
            return new AdditionalUnattendContentArgs(componentName, content, passName, settingName);
        }
    }
}
