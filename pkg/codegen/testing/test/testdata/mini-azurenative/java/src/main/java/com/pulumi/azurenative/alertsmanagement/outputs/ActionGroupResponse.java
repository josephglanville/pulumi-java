// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ActionGroupResponse {
    /**
     * @return Action group to trigger if action rule matches
     * 
     */
    private String actionGroupId;
    /**
     * @return Creation time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    private String createdAt;
    /**
     * @return Created by user name.
     * 
     */
    private String createdBy;
    /**
     * @return Description of action rule
     * 
     */
    private @Nullable String description;
    /**
     * @return Last updated time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    private String lastModifiedAt;
    /**
     * @return Last modified by user name.
     * 
     */
    private String lastModifiedBy;
    /**
     * @return Indicates if the given action rule is enabled or disabled
     * 
     */
    private @Nullable String status;
    /**
     * @return Indicates type of action rule
     * Expected value is &#39;ActionGroup&#39;.
     * 
     */
    private String type;

    private ActionGroupResponse() {}
    /**
     * @return Action group to trigger if action rule matches
     * 
     */
    public String actionGroupId() {
        return this.actionGroupId;
    }
    /**
     * @return Creation time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Created by user name.
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * @return Description of action rule
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Last updated time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    public String lastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * @return Last modified by user name.
     * 
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * @return Indicates if the given action rule is enabled or disabled
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Indicates type of action rule
     * Expected value is &#39;ActionGroup&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionGroupResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String actionGroupId;
        private String createdAt;
        private String createdBy;
        private @Nullable String description;
        private String lastModifiedAt;
        private String lastModifiedBy;
        private @Nullable String status;
        private String type;
        public Builder() {}
        public Builder(ActionGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroupId = defaults.actionGroupId;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.description = defaults.description;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder actionGroupId(String actionGroupId) {
            if (actionGroupId == null) {
              throw new MissingRequiredPropertyException("ActionGroupResponse", "actionGroupId");
            }
            this.actionGroupId = actionGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("ActionGroupResponse", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder createdBy(String createdBy) {
            if (createdBy == null) {
              throw new MissingRequiredPropertyException("ActionGroupResponse", "createdBy");
            }
            this.createdBy = createdBy;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder lastModifiedAt(String lastModifiedAt) {
            if (lastModifiedAt == null) {
              throw new MissingRequiredPropertyException("ActionGroupResponse", "lastModifiedAt");
            }
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }
        @CustomType.Setter
        public Builder lastModifiedBy(String lastModifiedBy) {
            if (lastModifiedBy == null) {
              throw new MissingRequiredPropertyException("ActionGroupResponse", "lastModifiedBy");
            }
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("ActionGroupResponse", "type");
            }
            this.type = type;
            return this;
        }
        public ActionGroupResponse build() {
            final var _resultValue = new ActionGroupResponse();
            _resultValue.actionGroupId = actionGroupId;
            _resultValue.createdAt = createdAt;
            _resultValue.createdBy = createdBy;
            _resultValue.description = description;
            _resultValue.lastModifiedAt = lastModifiedAt;
            _resultValue.lastModifiedBy = lastModifiedBy;
            _resultValue.status = status;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
