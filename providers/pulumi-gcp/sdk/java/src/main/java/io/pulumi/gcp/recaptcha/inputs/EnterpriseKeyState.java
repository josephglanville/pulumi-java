// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.recaptcha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.recaptcha.inputs.EnterpriseKeyAndroidSettingsGetArgs;
import io.pulumi.gcp.recaptcha.inputs.EnterpriseKeyIosSettingsGetArgs;
import io.pulumi.gcp.recaptcha.inputs.EnterpriseKeyTestingOptionsGetArgs;
import io.pulumi.gcp.recaptcha.inputs.EnterpriseKeyWebSettingsGetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnterpriseKeyState extends io.pulumi.resources.ResourceArgs {

    public static final EnterpriseKeyState Empty = new EnterpriseKeyState();

    /**
     * Settings for keys that can be used by Android apps.
     * 
     */
    @Import(name="androidSettings")
      private final @Nullable Output<EnterpriseKeyAndroidSettingsGetArgs> androidSettings;

    public Output<EnterpriseKeyAndroidSettingsGetArgs> getAndroidSettings() {
        return this.androidSettings == null ? Codegen.empty() : this.androidSettings;
    }

    /**
     * The timestamp corresponding to the creation of this Key.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    /**
     * Human-readable display name of this key. Modifiable by user.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Settings for keys that can be used by iOS apps.
     * 
     */
    @Import(name="iosSettings")
      private final @Nullable Output<EnterpriseKeyIosSettingsGetArgs> iosSettings;

    public Output<EnterpriseKeyIosSettingsGetArgs> getIosSettings() {
        return this.iosSettings == null ? Codegen.empty() : this.iosSettings;
    }

    /**
     * See [Creating and managing labels](https://cloud.google.com/recaptcha-enterprise/docs/labels).
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The resource name for the Key in the format "projects/{project}/keys/{key}".
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Options for user acceptance testing.
     * 
     */
    @Import(name="testingOptions")
      private final @Nullable Output<EnterpriseKeyTestingOptionsGetArgs> testingOptions;

    public Output<EnterpriseKeyTestingOptionsGetArgs> getTestingOptions() {
        return this.testingOptions == null ? Codegen.empty() : this.testingOptions;
    }

    /**
     * Settings for keys that can be used by websites.
     * 
     */
    @Import(name="webSettings")
      private final @Nullable Output<EnterpriseKeyWebSettingsGetArgs> webSettings;

    public Output<EnterpriseKeyWebSettingsGetArgs> getWebSettings() {
        return this.webSettings == null ? Codegen.empty() : this.webSettings;
    }

    public EnterpriseKeyState(
        @Nullable Output<EnterpriseKeyAndroidSettingsGetArgs> androidSettings,
        @Nullable Output<String> createTime,
        @Nullable Output<String> displayName,
        @Nullable Output<EnterpriseKeyIosSettingsGetArgs> iosSettings,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<EnterpriseKeyTestingOptionsGetArgs> testingOptions,
        @Nullable Output<EnterpriseKeyWebSettingsGetArgs> webSettings) {
        this.androidSettings = androidSettings;
        this.createTime = createTime;
        this.displayName = displayName;
        this.iosSettings = iosSettings;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.testingOptions = testingOptions;
        this.webSettings = webSettings;
    }

    private EnterpriseKeyState() {
        this.androidSettings = Codegen.empty();
        this.createTime = Codegen.empty();
        this.displayName = Codegen.empty();
        this.iosSettings = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.testingOptions = Codegen.empty();
        this.webSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EnterpriseKeyAndroidSettingsGetArgs> androidSettings;
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> displayName;
        private @Nullable Output<EnterpriseKeyIosSettingsGetArgs> iosSettings;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<EnterpriseKeyTestingOptionsGetArgs> testingOptions;
        private @Nullable Output<EnterpriseKeyWebSettingsGetArgs> webSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKeyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidSettings = defaults.androidSettings;
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.iosSettings = defaults.iosSettings;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.testingOptions = defaults.testingOptions;
    	      this.webSettings = defaults.webSettings;
        }

        public Builder androidSettings(@Nullable Output<EnterpriseKeyAndroidSettingsGetArgs> androidSettings) {
            this.androidSettings = androidSettings;
            return this;
        }
        public Builder androidSettings(@Nullable EnterpriseKeyAndroidSettingsGetArgs androidSettings) {
            this.androidSettings = Codegen.ofNullable(androidSettings);
            return this;
        }
        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder iosSettings(@Nullable Output<EnterpriseKeyIosSettingsGetArgs> iosSettings) {
            this.iosSettings = iosSettings;
            return this;
        }
        public Builder iosSettings(@Nullable EnterpriseKeyIosSettingsGetArgs iosSettings) {
            this.iosSettings = Codegen.ofNullable(iosSettings);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder testingOptions(@Nullable Output<EnterpriseKeyTestingOptionsGetArgs> testingOptions) {
            this.testingOptions = testingOptions;
            return this;
        }
        public Builder testingOptions(@Nullable EnterpriseKeyTestingOptionsGetArgs testingOptions) {
            this.testingOptions = Codegen.ofNullable(testingOptions);
            return this;
        }
        public Builder webSettings(@Nullable Output<EnterpriseKeyWebSettingsGetArgs> webSettings) {
            this.webSettings = webSettings;
            return this;
        }
        public Builder webSettings(@Nullable EnterpriseKeyWebSettingsGetArgs webSettings) {
            this.webSettings = Codegen.ofNullable(webSettings);
            return this;
        }        public EnterpriseKeyState build() {
            return new EnterpriseKeyState(androidSettings, createTime, displayName, iosSettings, labels, name, project, testingOptions, webSettings);
        }
    }
}
