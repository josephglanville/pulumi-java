// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxVersionNluSettingGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxVersionState extends io.pulumi.resources.ResourceArgs {

    public static final CxVersionState Empty = new CxVersionState();

    /**
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples:
     * "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="createTime")
      private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The human-readable name of the version. Limit of 64 characters.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Format: projects//locations//agents//flows//versions/. Version ID is a self-increasing number generated by Dialogflow
     * upon version creation.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The NLU settings of the flow at version creation.
     * 
     */
    @InputImport(name="nluSettings")
      private final @Nullable Input<List<CxVersionNluSettingGetArgs>> nluSettings;

    public Input<List<CxVersionNluSettingGetArgs>> getNluSettings() {
        return this.nluSettings == null ? Input.empty() : this.nluSettings;
    }

    /**
     * The Flow to create an Version for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
     * 
     */
    @InputImport(name="parent")
      private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    /**
     * The state of this version. * RUNNING: Version is not ready to serve (e.g. training is running). * SUCCEEDED: Training
     * has succeeded and this version is ready to serve. * FAILED: Version training failed.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public CxVersionState(
        @Nullable Input<String> createTime,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<String> name,
        @Nullable Input<List<CxVersionNluSettingGetArgs>> nluSettings,
        @Nullable Input<String> parent,
        @Nullable Input<String> state) {
        this.createTime = createTime;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
        this.nluSettings = nluSettings;
        this.parent = parent;
        this.state = state;
    }

    private CxVersionState() {
        this.createTime = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.name = Input.empty();
        this.nluSettings = Input.empty();
        this.parent = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxVersionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> name;
        private @Nullable Input<List<CxVersionNluSettingGetArgs>> nluSettings;
        private @Nullable Input<String> parent;
        private @Nullable Input<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(CxVersionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.nluSettings = defaults.nluSettings;
    	      this.parent = defaults.parent;
    	      this.state = defaults.state;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
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

        public Builder setNluSettings(@Nullable Input<List<CxVersionNluSettingGetArgs>> nluSettings) {
            this.nluSettings = nluSettings;
            return this;
        }

        public Builder setNluSettings(@Nullable List<CxVersionNluSettingGetArgs> nluSettings) {
            this.nluSettings = Input.ofNullable(nluSettings);
            return this;
        }

        public Builder setParent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder setParent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }
        public CxVersionState build() {
            return new CxVersionState(createTime, description, displayName, name, nluSettings, parent, state);
        }
    }
}
