// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DatabaseMigration.outputs.GetMigrationDatapumpSettingDataPumpParameter;
import com.pulumi.oci.DatabaseMigration.outputs.GetMigrationDatapumpSettingExportDirectoryObject;
import com.pulumi.oci.DatabaseMigration.outputs.GetMigrationDatapumpSettingImportDirectoryObject;
import com.pulumi.oci.DatabaseMigration.outputs.GetMigrationDatapumpSettingMetadataRemap;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMigrationDatapumpSetting {
    /**
     * @return Optional parameters for Data Pump Export and Import. Refer to [Configuring Optional Initial Load Advanced Settings](https://docs.us.oracle.com/en/cloud/paas/database-migration/dmsus/working-migration-resources.html#GUID-24BD3054-FDF8-48FF-8492-636C1D4B71ED)
     * 
     */
    private final List<GetMigrationDatapumpSettingDataPumpParameter> dataPumpParameters;
    /**
     * @return Directory object details, used to define either import or export directory objects in Data Pump Settings.
     * 
     */
    private final List<GetMigrationDatapumpSettingExportDirectoryObject> exportDirectoryObjects;
    /**
     * @return Directory object details, used to define either import or export directory objects in Data Pump Settings.
     * 
     */
    private final List<GetMigrationDatapumpSettingImportDirectoryObject> importDirectoryObjects;
    /**
     * @return Data Pump job mode. Refer to [Data Pump Export Modes ](https://docs.oracle.com/en/database/oracle/oracle-database/19/sutil/oracle-data-pump-export-utility.html#GUID-8E497131-6B9B-4CC8-AA50-35F480CAC2C4)
     * 
     */
    private final String jobMode;
    /**
     * @return Defines remapping to be applied to objects as they are processed. Refer to [METADATA_REMAP Procedure ](https://docs.oracle.com/en/database/oracle/oracle-database/19/arpls/DBMS_DATAPUMP.html#GUID-0FC32790-91E6-4781-87A3-229DE024CB3D)
     * 
     */
    private final List<GetMigrationDatapumpSettingMetadataRemap> metadataRemaps;

    @CustomType.Constructor
    private GetMigrationDatapumpSetting(
        @CustomType.Parameter("dataPumpParameters") List<GetMigrationDatapumpSettingDataPumpParameter> dataPumpParameters,
        @CustomType.Parameter("exportDirectoryObjects") List<GetMigrationDatapumpSettingExportDirectoryObject> exportDirectoryObjects,
        @CustomType.Parameter("importDirectoryObjects") List<GetMigrationDatapumpSettingImportDirectoryObject> importDirectoryObjects,
        @CustomType.Parameter("jobMode") String jobMode,
        @CustomType.Parameter("metadataRemaps") List<GetMigrationDatapumpSettingMetadataRemap> metadataRemaps) {
        this.dataPumpParameters = dataPumpParameters;
        this.exportDirectoryObjects = exportDirectoryObjects;
        this.importDirectoryObjects = importDirectoryObjects;
        this.jobMode = jobMode;
        this.metadataRemaps = metadataRemaps;
    }

    /**
     * @return Optional parameters for Data Pump Export and Import. Refer to [Configuring Optional Initial Load Advanced Settings](https://docs.us.oracle.com/en/cloud/paas/database-migration/dmsus/working-migration-resources.html#GUID-24BD3054-FDF8-48FF-8492-636C1D4B71ED)
     * 
     */
    public List<GetMigrationDatapumpSettingDataPumpParameter> dataPumpParameters() {
        return this.dataPumpParameters;
    }
    /**
     * @return Directory object details, used to define either import or export directory objects in Data Pump Settings.
     * 
     */
    public List<GetMigrationDatapumpSettingExportDirectoryObject> exportDirectoryObjects() {
        return this.exportDirectoryObjects;
    }
    /**
     * @return Directory object details, used to define either import or export directory objects in Data Pump Settings.
     * 
     */
    public List<GetMigrationDatapumpSettingImportDirectoryObject> importDirectoryObjects() {
        return this.importDirectoryObjects;
    }
    /**
     * @return Data Pump job mode. Refer to [Data Pump Export Modes ](https://docs.oracle.com/en/database/oracle/oracle-database/19/sutil/oracle-data-pump-export-utility.html#GUID-8E497131-6B9B-4CC8-AA50-35F480CAC2C4)
     * 
     */
    public String jobMode() {
        return this.jobMode;
    }
    /**
     * @return Defines remapping to be applied to objects as they are processed. Refer to [METADATA_REMAP Procedure ](https://docs.oracle.com/en/database/oracle/oracle-database/19/arpls/DBMS_DATAPUMP.html#GUID-0FC32790-91E6-4781-87A3-229DE024CB3D)
     * 
     */
    public List<GetMigrationDatapumpSettingMetadataRemap> metadataRemaps() {
        return this.metadataRemaps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMigrationDatapumpSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetMigrationDatapumpSettingDataPumpParameter> dataPumpParameters;
        private List<GetMigrationDatapumpSettingExportDirectoryObject> exportDirectoryObjects;
        private List<GetMigrationDatapumpSettingImportDirectoryObject> importDirectoryObjects;
        private String jobMode;
        private List<GetMigrationDatapumpSettingMetadataRemap> metadataRemaps;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMigrationDatapumpSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataPumpParameters = defaults.dataPumpParameters;
    	      this.exportDirectoryObjects = defaults.exportDirectoryObjects;
    	      this.importDirectoryObjects = defaults.importDirectoryObjects;
    	      this.jobMode = defaults.jobMode;
    	      this.metadataRemaps = defaults.metadataRemaps;
        }

        public Builder dataPumpParameters(List<GetMigrationDatapumpSettingDataPumpParameter> dataPumpParameters) {
            this.dataPumpParameters = Objects.requireNonNull(dataPumpParameters);
            return this;
        }
        public Builder dataPumpParameters(GetMigrationDatapumpSettingDataPumpParameter... dataPumpParameters) {
            return dataPumpParameters(List.of(dataPumpParameters));
        }
        public Builder exportDirectoryObjects(List<GetMigrationDatapumpSettingExportDirectoryObject> exportDirectoryObjects) {
            this.exportDirectoryObjects = Objects.requireNonNull(exportDirectoryObjects);
            return this;
        }
        public Builder exportDirectoryObjects(GetMigrationDatapumpSettingExportDirectoryObject... exportDirectoryObjects) {
            return exportDirectoryObjects(List.of(exportDirectoryObjects));
        }
        public Builder importDirectoryObjects(List<GetMigrationDatapumpSettingImportDirectoryObject> importDirectoryObjects) {
            this.importDirectoryObjects = Objects.requireNonNull(importDirectoryObjects);
            return this;
        }
        public Builder importDirectoryObjects(GetMigrationDatapumpSettingImportDirectoryObject... importDirectoryObjects) {
            return importDirectoryObjects(List.of(importDirectoryObjects));
        }
        public Builder jobMode(String jobMode) {
            this.jobMode = Objects.requireNonNull(jobMode);
            return this;
        }
        public Builder metadataRemaps(List<GetMigrationDatapumpSettingMetadataRemap> metadataRemaps) {
            this.metadataRemaps = Objects.requireNonNull(metadataRemaps);
            return this;
        }
        public Builder metadataRemaps(GetMigrationDatapumpSettingMetadataRemap... metadataRemaps) {
            return metadataRemaps(List.of(metadataRemaps));
        }        public GetMigrationDatapumpSetting build() {
            return new GetMigrationDatapumpSetting(dataPumpParameters, exportDirectoryObjects, importDirectoryObjects, jobMode, metadataRemaps);
        }
    }
}
