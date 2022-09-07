package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Command numbers to be used with CmdNum property. These also correspond to scope id's passed with EnterScope and ExitScope events, and pass command ranges to Get/SetFilterCommands.
 * </p>
 */
public enum tagVisUICmds implements ComEnum {
  /**
   * <p>
   * A value <= the id of any command.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visCmdFirst(0),
  /**
   * <p>
   * A value >= the id of any command.
   * </p>
   * <p>
   * The value of this constant is 65535
   * </p>
   */
  visCmdLast(65535),
  /**
   * <p>
   * This will be the CmdNum of a MenuItem representing a submenu.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visCmdHierarchical(0),
  /**
   * <p>
   * The value of this constant is 1001
   * </p>
   */
  visCmdFileNew(1001),
  /**
   * <p>
   * The value of this constant is 1002
   * </p>
   */
  visCmdFileOpen(1002),
  /**
   * <p>
   * The value of this constant is 1003
   * </p>
   */
  visCmdFileClose(1003),
  /**
   * <p>
   * The value of this constant is 1004
   * </p>
   */
  visCmdFileSave(1004),
  /**
   * <p>
   * The value of this constant is 1005
   * </p>
   */
  visCmdFileSaveAs(1005),
  /**
   * <p>
   * The value of this constant is 1006
   * </p>
   */
  visCmdFileSaveWorkspace(1006),
  /**
   * <p>
   * The value of this constant is 1007
   * </p>
   */
  visCmdFileImport(1007),
  /**
   * <p>
   * The value of this constant is 1009
   * </p>
   */
  visCmdFileSummaryInfoDlg(1009),
  /**
   * <p>
   * The value of this constant is 1010
   * </p>
   */
  visCmdFilePrint(1010),
  /**
   * <p>
   * The value of this constant is 1012
   * </p>
   */
  visCmdFileLastFile1(1012),
  /**
   * <p>
   * The value of this constant is 1013
   * </p>
   */
  visCmdFileLastFile2(1013),
  /**
   * <p>
   * The value of this constant is 1014
   * </p>
   */
  visCmdFileLastFile3(1014),
  /**
   * <p>
   * The value of this constant is 1015
   * </p>
   */
  visCmdFileLastFile4(1015),
  /**
   * <p>
   * The value of this constant is 1016
   * </p>
   */
  visCmdFileExit(1016),
  /**
   * <p>
   * The value of this constant is 1017
   * </p>
   */
  visCmdEditUndo(1017),
  /**
   * <p>
   * The value of this constant is 1018
   * </p>
   */
  visCmdEditRedo(1018),
  /**
   * <p>
   * The value of this constant is 1019
   * </p>
   */
  visCmdEditRepeat(1019),
  /**
   * <p>
   * The value of this constant is 1020
   * </p>
   */
  visCmdUFEditCut(1020),
  /**
   * <p>
   * The value of this constant is 1021
   * </p>
   */
  visCmdUFEditCopy(1021),
  /**
   * <p>
   * The value of this constant is 1022
   * </p>
   */
  visCmdUFEditPaste(1022),
  /**
   * <p>
   * The value of this constant is 1023
   * </p>
   */
  visCmdUFEditClear(1023),
  /**
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  visCmdUFEditDuplicate(1024),
  /**
   * <p>
   * The value of this constant is 1025
   * </p>
   */
  visCmdUFEditSelectAll(1025),
  /**
   * <p>
   * The value of this constant is 1026
   * </p>
   */
  visCmdEditSelectSpecial(1026),
  /**
   * <p>
   * The value of this constant is 1027
   * </p>
   */
  visCmdEditPasteSpecial(1027),
  /**
   * <p>
   * The value of this constant is 1028
   * </p>
   */
  visCmdEditPasteLink(1028),
  /**
   * <p>
   * The value of this constant is 1029
   * </p>
   */
  visCmdEditOpenObject(1029),
  /**
   * <p>
   * The value of this constant is 1030
   * </p>
   */
  visCmdEditLinks(1030),
  /**
   * <p>
   * The value of this constant is 1031
   * </p>
   */
  visCmdEditInsertObject(1031),
  /**
   * <p>
   * The value of this constant is 1032
   * </p>
   */
  visCmdEditInsertField(1032),
  /**
   * <p>
   * The value of this constant is 1033
   * </p>
   */
  visCmdViewFitInWindow(1033),
  /**
   * <p>
   * The value of this constant is 1034
   * </p>
   */
  visCmdView75(1034),
  /**
   * <p>
   * The value of this constant is 1035
   * </p>
   */
  visCmdView100(1035),
  /**
   * <p>
   * The value of this constant is 1036
   * </p>
   */
  visCmdView150(1036),
  /**
   * <p>
   * The value of this constant is 1037
   * </p>
   */
  visCmdView200(1037),
  /**
   * <p>
   * The value of this constant is 1038
   * </p>
   */
  visCmdViewCustom(1038),
  /**
   * <p>
   * The value of this constant is 1039
   * </p>
   */
  visCmdViewRulers(1039),
  /**
   * <p>
   * The value of this constant is 1040
   * </p>
   */
  visCmdViewGrid(1040),
  /**
   * <p>
   * The value of this constant is 1041
   * </p>
   */
  visCmdViewGuides(1041),
  /**
   * <p>
   * The value of this constant is 1042
   * </p>
   */
  visCmdViewConnections(1042),
  /**
   * <p>
   * The value of this constant is 1043
   * </p>
   */
  visCmdEditFind(1043),
  /**
   * <p>
   * The value of this constant is 1044
   * </p>
   */
  visCmdViewStatusBar(1044),
  /**
   * <p>
   * The value of this constant is 1045
   * </p>
   */
  visCmdObjectBringForward(1045),
  /**
   * <p>
   * The value of this constant is 1046
   * </p>
   */
  visCmdObjectBringToFront(1046),
  /**
   * <p>
   * The value of this constant is 1047
   * </p>
   */
  visCmdObjectSendBackward(1047),
  /**
   * <p>
   * The value of this constant is 1048
   * </p>
   */
  visCmdObjectSendToBack(1048),
  /**
   * <p>
   * The value of this constant is 1049
   * </p>
   */
  visCmdObjectAlignObjects(1049),
  /**
   * <p>
   * The value of this constant is 1050
   * </p>
   */
  visCmdObjectConnectObjects(1050),
  /**
   * <p>
   * The value of this constant is 1051
   * </p>
   */
  visCmdObjectGroup(1051),
  /**
   * <p>
   * The value of this constant is 1052
   * </p>
   */
  visCmdObjectUngroup(1052),
  /**
   * <p>
   * The value of this constant is 1053
   * </p>
   */
  visCmdObjectAddToGroup(1053),
  /**
   * <p>
   * The value of this constant is 1054
   * </p>
   */
  visCmdObjectRemoveFromGroup(1054),
  /**
   * <p>
   * The value of this constant is 1055
   * </p>
   */
  visCmdObjectConvertToGroup(1055),
  /**
   * <p>
   * The value of this constant is 1056
   * </p>
   */
  visCmdObjectRotate90(1056),
  /**
   * <p>
   * The value of this constant is 1057
   * </p>
   */
  visCmdObjectFlipVertical(1057),
  /**
   * <p>
   * The value of this constant is 1058
   * </p>
   */
  visCmdObjectFlipHorizontal(1058),
  /**
   * <p>
   * The value of this constant is 1059
   * </p>
   */
  visCmdObjectReverse(1059),
  /**
   * <p>
   * The value of this constant is 1060
   * </p>
   */
  visCmdObjectUnion(1060),
  /**
   * <p>
   * The value of this constant is 1061
   * </p>
   */
  visCmdObjectCombine(1061),
  /**
   * <p>
   * The value of this constant is 1062
   * </p>
   */
  visCmdObjectFragment(1062),
  /**
   * <p>
   * The value of this constant is 1063
   * </p>
   */
  visCmdFormatStyle(1063),
  /**
   * <p>
   * The value of this constant is 1064
   * </p>
   */
  visCmdFormatDefineStyles(1064),
  /**
   * <p>
   * The value of this constant is 1065
   * </p>
   */
  visCmdFormatLine(1065),
  /**
   * <p>
   * The value of this constant is 1066
   * </p>
   */
  visCmdFormatFill(1066),
  /**
   * <p>
   * The value of this constant is 1067
   * </p>
   */
  visCmdFormatText(1067),
  /**
   * <p>
   * The value of this constant is 1068
   * </p>
   */
  visCmdFormatParagraph(1068),
  /**
   * <p>
   * The value of this constant is 1069
   * </p>
   */
  visCmdFormatTabs(1069),
  /**
   * <p>
   * The value of this constant is 1070
   * </p>
   */
  visCmdFormatBlock(1070),
  /**
   * <p>
   * The value of this constant is 1071
   * </p>
   */
  visCmdFormatBehavior(1071),
  /**
   * <p>
   * The value of this constant is 1072
   * </p>
   */
  visCmdFormatProtection(1072),
  /**
   * <p>
   * The value of this constant is 1073
   * </p>
   */
  visCmdFormatSpecial(1073),
  /**
   * <p>
   * The value of this constant is 1074
   * </p>
   */
  visCmdOptionsEditDrawing(1074),
  /**
   * <p>
   * The value of this constant is 1075
   * </p>
   */
  visCmdOptionsEditBackground(1075),
  /**
   * <p>
   * The value of this constant is 1076
   * </p>
   */
  visCmdOptionsPageSetup(1076),
  /**
   * <p>
   * The value of this constant is 1077
   * </p>
   */
  visCmdOptionsGoToDrawing(1077),
  /**
   * <p>
   * The value of this constant is 1078
   * </p>
   */
  visCmdOptionsNewPage(1078),
  /**
   * <p>
   * The value of this constant is 1079
   * </p>
   */
  visCmdOptionsDeletePages(1079),
  /**
   * <p>
   * The value of this constant is 1080
   * </p>
   */
  visCmdOptionsReorderPages(1080),
  /**
   * <p>
   * The value of this constant is 1081
   * </p>
   */
  visCmdOptionsPreferences(1081),
  /**
   * <p>
   * The value of this constant is 1082
   * </p>
   */
  visCmdOptionsColorPaletteDlg(1082),
  /**
   * <p>
   * The value of this constant is 1083
   * </p>
   */
  visCmdOptionsProtectDocument(1083),
  /**
   * <p>
   * The value of this constant is 1084
   * </p>
   */
  visCmdOptionsSnapGlueSetup(1084),
  /**
   * <p>
   * The value of this constant is 1085
   * </p>
   */
  visCmdWindowNewWindow(1085),
  /**
   * <p>
   * The value of this constant is 1086
   * </p>
   */
  visCmdWindowCascadeAll(1086),
  /**
   * <p>
   * The value of this constant is 1087
   * </p>
   */
  visCmdWindowTileAll(1087),
  /**
   * <p>
   * The value of this constant is 1088
   * </p>
   */
  visCmdWindowShowShapeSheet(1088),
  /**
   * <p>
   * The value of this constant is 1089
   * </p>
   */
  visCmdWindowShowMasterObjects(1089),
  /**
   * <p>
   * The value of this constant is 1090
   * </p>
   */
  visCmdRunAddOnMenu(1090),
  /**
   * <p>
   * The value of this constant is 1091
   * </p>
   */
  visCmdWindowShowDrawPage(1091),
  /**
   * <p>
   * The value of this constant is 1092
   * </p>
   */
  visCmdHelpContents(1092),
  /**
   * <p>
   * The value of this constant is 1093
   * </p>
   */
  visCmdDecreaseIndent(1093),
  /**
   * <p>
   * The value of this constant is 1094
   * </p>
   */
  visCmdIncreaseIndent(1094),
  /**
   * <p>
   * The value of this constant is 1095
   * </p>
   */
  visCmdDecreaseParaSpacing(1095),
  /**
   * <p>
   * The value of this constant is 1096
   * </p>
   */
  visCmdIncreaseParaSpacing(1096),
  /**
   * <p>
   * The value of this constant is 1097
   * </p>
   */
  visCmdHelpStencil(1097),
  /**
   * <p>
   * The value of this constant is 1098
   * </p>
   */
  visCmdTextRotate90(1098),
  /**
   * <p>
   * The value of this constant is 1099
   * </p>
   */
  visCmdHelpQuickTour(1099),
  /**
   * <p>
   * The value of this constant is 1100
   * </p>
   */
  visCmdHelpAboutVisio(1100),
  /**
   * <p>
   * The value of this constant is 1101
   * </p>
   */
  visCmdStenEditIcon(1101),
  /**
   * <p>
   * The value of this constant is 1102
   * </p>
   */
  visCmdStenEditDrawing(1102),
  /**
   * <p>
   * The value of this constant is 1103
   * </p>
   */
  visCmdStenNameMaster(1103),
  /**
   * <p>
   * The value of this constant is 1104
   * </p>
   */
  visCmdStenNewMaster(1104),
  /**
   * <p>
   * The value of this constant is 1105
   * </p>
   */
  visCmdStenImageMaster(1105),
  /**
   * <p>
   * The value of this constant is 1106
   * </p>
   */
  visCmdStenCleanup(1106),
  /**
   * <p>
   * The value of this constant is 1107
   * </p>
   */
  visCmdSWShowValues(1107),
  /**
   * <p>
   * The value of this constant is 1108
   * </p>
   */
  visCmdSWShowFormulas(1108),
  /**
   * <p>
   * The value of this constant is 1109
   * </p>
   */
  visCmdSWShowSectionsDlg(1109),
  /**
   * <p>
   * The value of this constant is 1110
   * </p>
   */
  visCmdSWPasteNameDlg(1110),
  /**
   * <p>
   * The value of this constant is 1111
   * </p>
   */
  visCmdSWPasteFunctionDlg(1111),
  /**
   * <p>
   * The value of this constant is 1112
   * </p>
   */
  visCmdSWInsertRow(1112),
  /**
   * <p>
   * The value of this constant is 1113
   * </p>
   */
  visCmdSWInsertRowAfter(1113),
  /**
   * <p>
   * The value of this constant is 1114
   * </p>
   */
  visCmdSWChangeRowTypeDlg(1114),
  /**
   * <p>
   * The value of this constant is 1115
   * </p>
   */
  visCmdSWDeleteRow(1115),
  /**
   * <p>
   * The value of this constant is 1116
   * </p>
   */
  visCmdSWAddSectionDlg(1116),
  /**
   * <p>
   * The value of this constant is 1117
   * </p>
   */
  visCmdSWDeleteSection(1117),
  /**
   * <p>
   * The value of this constant is 1118
   * </p>
   */
  visCmdFormatDoubleClick(1118),
  /**
   * <p>
   * The value of this constant is 1121
   * </p>
   */
  visCmdDrawTextStyle(1121),
  /**
   * <p>
   * The value of this constant is 1122
   * </p>
   */
  visCmdDrawLineStyle(1122),
  /**
   * <p>
   * The value of this constant is 1123
   * </p>
   */
  visCmdDrawFillStyle(1123),
  /**
   * <p>
   * The value of this constant is 1124
   * </p>
   */
  visCmdDrawSnap(1124),
  /**
   * <p>
   * The value of this constant is 1125
   * </p>
   */
  visCmdDrawGlue(1125),
  /**
   * <p>
   * The value of this constant is 1126
   * </p>
   */
  visCmdDrawZoom(1126),
  /**
   * <p>
   * The value of this constant is 1128
   * </p>
   */
  visCmdTextStyle(1128),
  /**
   * <p>
   * The value of this constant is 1129
   * </p>
   */
  visCmdTextFont(1129),
  /**
   * <p>
   * The value of this constant is 1130
   * </p>
   */
  visCmdTextSize(1130),
  /**
   * <p>
   * The value of this constant is 1131
   * </p>
   */
  visCmdTextBold(1131),
  /**
   * <p>
   * The value of this constant is 1132
   * </p>
   */
  visCmdTextItalic(1132),
  /**
   * <p>
   * The value of this constant is 1133
   * </p>
   */
  visCmdTextSmallCaps(1133),
  /**
   * <p>
   * The value of this constant is 1134
   * </p>
   */
  visCmdTextSuperscript(1134),
  /**
   * <p>
   * The value of this constant is 1135
   * </p>
   */
  visCmdTextSubscript(1135),
  /**
   * <p>
   * The value of this constant is 1136
   * </p>
   */
  visCmdTextUline(1136),
  /**
   * <p>
   * The value of this constant is 1139
   * </p>
   */
  visCmdSWCancel(1139),
  /**
   * <p>
   * The value of this constant is 1140
   * </p>
   */
  visCmdSWAccept(1140),
  /**
   * <p>
   * The value of this constant is 1141
   * </p>
   */
  visCmdSWFormula(1141),
  /**
   * <p>
   * The value of this constant is 1142
   * </p>
   */
  visCmdSWShowToggle(1142),
  /**
   * <p>
   * The value of this constant is 1143
   * </p>
   */
  visCmdIconLeftColor(1143),
  /**
   * <p>
   * The value of this constant is 1144
   * </p>
   */
  visCmdIconRightColor(1144),
  /**
   * <p>
   * The value of this constant is 1145
   * </p>
   */
  visCmdIconPencilTool(1145),
  /**
   * <p>
   * The value of this constant is 1146
   * </p>
   */
  visCmdRecalcObjectWH(1146),
  /**
   * <p>
   * The value of this constant is 1147
   * </p>
   */
  visCmdTurnToPrevPage(1147),
  /**
   * <p>
   * The value of this constant is 1148
   * </p>
   */
  visCmdTurnToNextPage(1148),
  /**
   * <p>
   * The value of this constant is 1179
   * </p>
   */
  visCmdEditReplace(1179),
  /**
   * <p>
   * The value of this constant is 1180
   * </p>
   */
  visCmdDrawAddGuide(1180),
  /**
   * <p>
   * The value of this constant is 1181
   * </p>
   */
  visCmdAddTextShape(1181),
  /**
   * <p>
   * The value of this constant is 1182
   * </p>
   */
  visCmdDrawRect(1182),
  /**
   * <p>
   * The value of this constant is 1183
   * </p>
   */
  visCmdDrawOval(1183),
  /**
   * <p>
   * The value of this constant is 1184
   * </p>
   */
  visCmdDragDuplicate(1184),
  /**
   * <p>
   * The value of this constant is 1185
   * </p>
   */
  visCmdMoveObject(1185),
  /**
   * <p>
   * The value of this constant is 1186
   * </p>
   */
  visCmdMove1D(1186),
  /**
   * <p>
   * The value of this constant is 1187
   * </p>
   */
  visCmdMove2D(1187),
  /**
   * <p>
   * The value of this constant is 1188
   * </p>
   */
  visCmdSize1D(1188),
  /**
   * <p>
   * The value of this constant is 1189
   * </p>
   */
  visCmdSize2D(1189),
  /**
   * <p>
   * The value of this constant is 1190
   * </p>
   */
  visCmdRotateObject(1190),
  /**
   * <p>
   * The value of this constant is 1192
   * </p>
   */
  visCmdCropObject(1192),
  /**
   * <p>
   * The value of this constant is 1193
   * </p>
   */
  visCmdPanObject(1193),
  /**
   * <p>
   * The value of this constant is 1194
   * </p>
   */
  visCmdSizeTextBlock(1194),
  /**
   * <p>
   * The value of this constant is 1196
   * </p>
   */
  visCmdAlignObjectLeft(1196),
  /**
   * <p>
   * The value of this constant is 1197
   * </p>
   */
  visCmdAlignObjectCenter(1197),
  /**
   * <p>
   * The value of this constant is 1198
   * </p>
   */
  visCmdAlignObjectRight(1198),
  /**
   * <p>
   * The value of this constant is 1199
   * </p>
   */
  visCmdAlignObjectTop(1199),
  /**
   * <p>
   * The value of this constant is 1200
   * </p>
   */
  visCmdAlignObjectMiddle(1200),
  /**
   * <p>
   * The value of this constant is 1201
   * </p>
   */
  visCmdAlignObjectBottom(1201),
  /**
   * <p>
   * The value of this constant is 1202
   * </p>
   */
  visCmdCenterDrawing(1202),
  /**
   * <p>
   * The value of this constant is 1213
   * </p>
   */
  visCmdDeselectAll(1213),
  /**
   * <p>
   * The value of this constant is 1214
   * </p>
   */
  visCmdTextEditState(1214),
  /**
   * <p>
   * The value of this constant is 1215
   * </p>
   */
  visCmdZoomPt(1215),
  /**
   * <p>
   * The value of this constant is 1216
   * </p>
   */
  visCmdZoomIn(1216),
  /**
   * <p>
   * The value of this constant is 1217
   * </p>
   */
  visCmdZoomOut(1217),
  /**
   * <p>
   * The value of this constant is 1218
   * </p>
   */
  visCmdZoomArea(1218),
  /**
   * <p>
   * The value of this constant is 1219
   * </p>
   */
  visCmdDRPointerTool(1219),
  /**
   * <p>
   * The value of this constant is 1220
   * </p>
   */
  visCmdDRPencilTool(1220),
  /**
   * <p>
   * The value of this constant is 1221
   * </p>
   */
  visCmdDRLineTool(1221),
  /**
   * <p>
   * The value of this constant is 1222
   * </p>
   */
  visCmdDRQtrArcTool(1222),
  /**
   * <p>
   * The value of this constant is 1223
   * </p>
   */
  visCmdDRRectTool(1223),
  /**
   * <p>
   * The value of this constant is 1224
   * </p>
   */
  visCmdDROvalTool(1224),
  /**
   * <p>
   * The value of this constant is 1225
   * </p>
   */
  visCmdDRConnectorTool(1225),
  /**
   * <p>
   * The value of this constant is 1226
   * </p>
   */
  visCmdDRConnectionTool(1226),
  /**
   * <p>
   * The value of this constant is 1227
   * </p>
   */
  visCmdDRTextTool(1227),
  /**
   * <p>
   * The value of this constant is 1228
   * </p>
   */
  visCmdDRRotateTool(1228),
  /**
   * <p>
   * The value of this constant is 1230
   * </p>
   */
  visCmdObjectDistributeDlg(1230),
  /**
   * <p>
   * The value of this constant is 1231
   * </p>
   */
  visCmdDistributeHSpace(1231),
  /**
   * <p>
   * The value of this constant is 1232
   * </p>
   */
  visCmdDistributeLeft(1232),
  /**
   * <p>
   * The value of this constant is 1233
   * </p>
   */
  visCmdDistributeCenter(1233),
  /**
   * <p>
   * The value of this constant is 1234
   * </p>
   */
  visCmdDistributeRight(1234),
  /**
   * <p>
   * The value of this constant is 1235
   * </p>
   */
  visCmdDistributeVSpace(1235),
  /**
   * <p>
   * The value of this constant is 1236
   * </p>
   */
  visCmdDistributeTop(1236),
  /**
   * <p>
   * The value of this constant is 1237
   * </p>
   */
  visCmdDistributeMiddle(1237),
  /**
   * <p>
   * The value of this constant is 1238
   * </p>
   */
  visCmdDistributeBottom(1238),
  /**
   * <p>
   * Id of scope in effect when content.dat updates.
   * </p>
   * <p>
   * The value of this constant is 1241
   * </p>
   */
  visCmdUpdateContentCache(1241),
  /**
   * <p>
   * The value of this constant is 1243
   * </p>
   */
  visCmdDropOnText(1243),
  /**
   * <p>
   * The value of this constant is 1244
   * </p>
   */
  visCmdDropOnStencil(1244),
  /**
   * <p>
   * The value of this constant is 1246
   * </p>
   */
  visCmdDropOnPage(1246),
  /**
   * <p>
   * The value of this constant is 1250
   * </p>
   */
  visCmdSSWindowCollapse(1250),
  /**
   * <p>
   * The value of this constant is 1251
   * </p>
   */
  visCmdSSWindowExpand(1251),
  /**
   * <p>
   * The value of this constant is 1252
   * </p>
   */
  visCmdSSWindowSelect(1252),
  /**
   * <p>
   * The value of this constant is 1253
   * </p>
   */
  visCmdSSWindowDeselect(1253),
  /**
   * <p>
   * The value of this constant is 1263
   * </p>
   */
  visCmdAddConnectPt(1263),
  /**
   * <p>
   * The value of this constant is 1264
   * </p>
   */
  visCmdModConnectPt(1264),
  /**
   * <p>
   * The value of this constant is 1265
   * </p>
   */
  visCmdDelConnectPt(1265),
  /**
   * <p>
   * The value of this constant is 1266
   * </p>
   */
  visCmdAddControlPt(1266),
  /**
   * <p>
   * The value of this constant is 1267
   * </p>
   */
  visCmdModControlPt(1267),
  /**
   * <p>
   * The value of this constant is 1268
   * </p>
   */
  visCmdDelControlPt(1268),
  /**
   * <p>
   * The value of this constant is 1269
   * </p>
   */
  visCmdMovConnectPt(1269),
  /**
   * <p>
   * The value of this constant is 1270
   * </p>
   */
  visCmdToolsSpelling(1270),
  /**
   * <p>
   * The value of this constant is 1271
   * </p>
   */
  visCmdFormatPainter(1271),
  /**
   * <p>
   * The value of this constant is 1274
   * </p>
   */
  visCmdPageMeasureUnitsDlg(1274),
  /**
   * <p>
   * The value of this constant is 1279
   * </p>
   */
  visCmdView50(1279),
  /**
   * <p>
   * The value of this constant is 1280
   * </p>
   */
  visCmdView400(1280),
  /**
   * <p>
   * The value of this constant is 1282
   * </p>
   */
  visCmdInsertDataMap(1282),
  /**
   * <p>
   * The value of this constant is 1292
   * </p>
   */
  visCmdSendAsMail(1292),
  /**
   * <p>
   * The value of this constant is 1309
   * </p>
   */
  visCmdShapeActions(1309),
  /**
   * <p>
   * The value of this constant is 1311
   * </p>
   */
  visCmdDRSplineTool(1311),
  /**
   * <p>
   * The value of this constant is 1312
   * </p>
   */
  visCmdFormatCustPropEdit(1312),
  /**
   * <p>
   * The value of this constant is 1318
   * </p>
   */
  visCmdRulerGridDlg(1318),
  /**
   * <p>
   * The value of this constant is 1333
   * </p>
   */
  visCmdFormatShadow(1333),
  /**
   * <p>
   * The value of this constant is 1334
   * </p>
   */
  visCmdFormatCorners(1334),
  /**
   * <p>
   * The value of this constant is 1335
   * </p>
   */
  visCmdToolsInventory(1335),
  /**
   * <p>
   * The value of this constant is 1343
   * </p>
   */
  visCmdMasterSetup(1343),
  /**
   * <p>
   * The value of this constant is 1354
   * </p>
   */
  visCmdToolsArrayShapesAddOn(1354),
  /**
   * <p>
   * The value of this constant is 1355
   * </p>
   */
  visCmdSetLineWeight(1355),
  /**
   * <p>
   * The value of this constant is 1356
   * </p>
   */
  visCmdSetLinePattern(1356),
  /**
   * <p>
   * The value of this constant is 1357
   * </p>
   */
  visCmdSetLineEnds(1357),
  /**
   * <p>
   * The value of this constant is 1358
   * </p>
   */
  visCmdSetLineCornerStyle(1358),
  /**
   * <p>
   * The value of this constant is 1359
   * </p>
   */
  visCmdSetLineColor(1359),
  /**
   * <p>
   * The value of this constant is 1361
   * </p>
   */
  visCmdCloseWindow(1361),
  /**
   * <p>
   * The value of this constant is 1379
   * </p>
   */
  visCmdSetFillShadow(1379),
  /**
   * <p>
   * The value of this constant is 1380
   * </p>
   */
  visCmdSSWindowShowSection(1380),
  /**
   * <p>
   * The value of this constant is 1381
   * </p>
   */
  visCmdSSWindowPasteName(1381),
  /**
   * <p>
   * The value of this constant is 1382
   * </p>
   */
  visCmdSSWindowPasteFunction(1382),
  /**
   * <p>
   * The value of this constant is 1383
   * </p>
   */
  visCmdSSWindowChangeRowType(1383),
  /**
   * <p>
   * The value of this constant is 1384
   * </p>
   */
  visCmdSSWindowAddSection(1384),
  /**
   * <p>
   * The value of this constant is 1385
   * </p>
   */
  visCmdSetFillColor(1385),
  /**
   * <p>
   * The value of this constant is 1386
   * </p>
   */
  visCmdHelpMode(1386),
  /**
   * <p>
   * The value of this constant is 1387
   * </p>
   */
  visCmdOffsetDlg(1387),
  /**
   * <p>
   * The value of this constant is 1388
   * </p>
   */
  visCmdDesignMode(1388),
  /**
   * <p>
   * The value of this constant is 1389
   * </p>
   */
  visCmdShapeExplorer(1389),
  /**
   * <p>
   * The value of this constant is 1399
   * </p>
   */
  visCmdSetFillPattern(1399),
  /**
   * <p>
   * The value of this constant is 1404
   * </p>
   */
  visCmdSetCharColor(1404),
  /**
   * <p>
   * The value of this constant is 1405
   * </p>
   */
  visCmdSetCharSizeUp(1405),
  /**
   * <p>
   * The value of this constant is 1406
   * </p>
   */
  visCmdSetCharSizeDown(1406),
  /**
   * <p>
   * The value of this constant is 1407
   * </p>
   */
  visCmdTextHAlignLeft(1407),
  /**
   * <p>
   * The value of this constant is 1408
   * </p>
   */
  visCmdTextHAlignCenter(1408),
  /**
   * <p>
   * The value of this constant is 1409
   * </p>
   */
  visCmdTextHAlignRight(1409),
  /**
   * <p>
   * The value of this constant is 1412
   * </p>
   */
  visCmdTextHAlignJustify(1412),
  /**
   * <p>
   * The value of this constant is 1413
   * </p>
   */
  visCmdTextVAlignTop(1413),
  /**
   * <p>
   * The value of this constant is 1414
   * </p>
   */
  visCmdTextVAlignMiddle(1414),
  /**
   * <p>
   * The value of this constant is 1422
   * </p>
   */
  visCmdTextVAlignBottom(1422),
  /**
   * <p>
   * The value of this constant is 1424
   * </p>
   */
  visCmdStampTool(1424),
  /**
   * <p>
   * The value of this constant is 1425
   * </p>
   */
  visCmdObjectInfoDlg(1425),
  /**
   * <p>
   * The value of this constant is 1428
   * </p>
   */
  visCmdObjectHelp(1428),
  /**
   * <p>
   * The value of this constant is 1439
   * </p>
   */
  visCmdEditConvertObject(1439),
  /**
   * <p>
   * The value of this constant is 1442
   * </p>
   */
  visCmdFileOpenStencil(1442),
  /**
   * <p>
   * The value of this constant is 1443
   * </p>
   */
  visCmdPrintPage(1443),
  /**
   * <p>
   * The value of this constant is 1444
   * </p>
   */
  visCmdSWShapeActionDlg(1444),
  /**
   * <p>
   * The value of this constant is 1446
   * </p>
   */
  visCmdLayerDlg(1446),
  /**
   * <p>
   * The value of this constant is 1448
   * </p>
   */
  visCmdLayerSetupDlg(1448),
  /**
   * <p>
   * The value of this constant is 1449
   * </p>
   */
  visCmdCropTool(1449),
  /**
   * <p>
   * The value of this constant is 1451
   * </p>
   */
  visCmdTextBlockTool(1451),
  /**
   * <p>
   * The value of this constant is 1452
   * </p>
   */
  visCmdStenClose(1452),
  /**
   * <p>
   * The value of this constant is 1453
   * </p>
   */
  visCmdIntersect(1453),
  /**
   * <p>
   * The value of this constant is 1454
   * </p>
   */
  visCmdSubtract(1454),
  /**
   * <p>
   * The value of this constant is 1458
   * </p>
   */
  visCmdStenActivate(1458),
  /**
   * <p>
   * The value of this constant is 1480
   * </p>
   */
  visCmdStenIconAndName(1480),
  /**
   * <p>
   * The value of this constant is 1481
   * </p>
   */
  visCmdStenIconOnly(1481),
  /**
   * <p>
   * The value of this constant is 1482
   * </p>
   */
  visCmdStenNameOnly(1482),
  /**
   * <p>
   * The value of this constant is 1483
   * </p>
   */
  visCmdStenAutoArrange(1483),
  /**
   * <p>
   * The value of this constant is 1484
   * </p>
   */
  visCmdRunAddOnDlg(1484),
  /**
   * <p>
   * The value of this constant is 1490
   * </p>
   */
  visCmdPrintPreview(1490),
  /**
   * <p>
   * The value of this constant is 1491
   * </p>
   */
  visCmdOpenInVisio(1491),
  /**
   * <p>
   * The value of this constant is 1492
   * </p>
   */
  visCmdFullScreenMode(1492),
  /**
   * <p>
   * The value of this constant is 1493
   * </p>
   */
  visCmdLayoutDynamic(1493),
  /**
   * <p>
   * The value of this constant is 1494
   * </p>
   */
  visCmdRotate90Clockwise(1494),
  /**
   * <p>
   * The value of this constant is 1495
   * </p>
   */
  visCmdZoomLast(1495),
  /**
   * <p>
   * The value of this constant is 1496
   * </p>
   */
  visCmdZoomPageWidth(1496),
  /**
   * <p>
   * The value of this constant is 1497
   * </p>
   */
  visCmdInsertClipArt(1497),
  /**
   * <p>
   * The value of this constant is 1498
   * </p>
   */
  visCmdInsertWordArt(1498),
  /**
   * <p>
   * The value of this constant is 1499
   * </p>
   */
  visCmdInsertMicrosoftGraph(1499),
  /**
   * <p>
   * The value of this constant is 1500
   * </p>
   */
  visCmdToolbarsDlg(1500),
  /**
   * <p>
   * The value of this constant is 1501
   * </p>
   */
  visCmdInsertComment(1501),
  /**
   * <p>
   * The value of this constant is 1502
   * </p>
   */
  visCmdMoveComment(1502),
  /**
   * <p>
   * The value of this constant is 1503
   * </p>
   */
  visCmdOpenCommentForEdit(1503),
  /**
   * <p>
   * The value of this constant is 1504
   * </p>
   */
  visCmdMSOInsertSymbol(1504),
  /**
   * <p>
   * The value of this constant is 1505
   * </p>
   */
  visCmdMSOInsertSymbolDlg(1505),
  /**
   * <p>
   * The value of this constant is 1506
   * </p>
   */
  visCmdINETAddToFavorites(1506),
  /**
   * <p>
   * The value of this constant is 1509
   * </p>
   */
  visCmdViewPageBreaks(1509),
  /**
   * <p>
   * The value of this constant is 1512
   * </p>
   */
  visCmdZoomSingleTile(1512),
  /**
   * <p>
   * The value of this constant is 1513
   * </p>
   */
  visCmdPreviousTile(1513),
  /**
   * <p>
   * The value of this constant is 1514
   * </p>
   */
  visCmdNextTile(1514),
  /**
   * <p>
   * The value of this constant is 1515
   * </p>
   */
  visCmdFirstTile(1515),
  /**
   * <p>
   * The value of this constant is 1516
   * </p>
   */
  visCmdLastTile(1516),
  /**
   * <p>
   * The value of this constant is 1521
   * </p>
   */
  visCmdInsertAutoCADAddOn(1521),
  /**
   * <p>
   * The value of this constant is 1522
   * </p>
   */
  visCmdInsertControlDlg(1522),
  /**
   * <p>
   * The value of this constant is 1533
   * </p>
   */
  visCmdJoin(1533),
  /**
   * <p>
   * The value of this constant is 1534
   * </p>
   */
  visCmdTrim(1534),
  /**
   * <p>
   * The value of this constant is 1536
   * </p>
   */
  visCmdDlgCustomFit(1536),
  /**
   * <p>
   * The value of this constant is 1538
   * </p>
   */
  visCmdFitCurve(1538),
  /**
   * <p>
   * The value of this constant is 1543
   * </p>
   */
  visCmdIconBucketTool(1543),
  /**
   * <p>
   * The value of this constant is 1544
   * </p>
   */
  visCmdIconLassoTool(1544),
  /**
   * <p>
   * The value of this constant is 1545
   * </p>
   */
  visCmdIconSelectNet(1545),
  /**
   * <p>
   * The value of this constant is 1561
   * </p>
   */
  visCmdFileLastFile5(1561),
  /**
   * <p>
   * The value of this constant is 1569
   * </p>
   */
  visCmdFileLastFile6(1569),
  /**
   * <p>
   * The value of this constant is 1570
   * </p>
   */
  visCmdFileLastFile7(1570),
  /**
   * <p>
   * The value of this constant is 1571
   * </p>
   */
  visCmdFileLastFile8(1571),
  /**
   * <p>
   * The value of this constant is 1572
   * </p>
   */
  visCmdFileLastFile9(1572),
  /**
   * <p>
   * The value of this constant is 1574
   * </p>
   */
  visCmdToolsLayoutShapesDlg(1574),
  /**
   * <p>
   * The value of this constant is 1576
   * </p>
   */
  visCmdToolsRunVBE(1576),
  /**
   * <p>
   * The value of this constant is 1577
   * </p>
   */
  visCmdToolsMacroDlg(1577),
  /**
   * <p>
   * The value of this constant is 1579
   * </p>
   */
  visCmdFileNewBlankDrawing(1579),
  /**
   * <p>
   * The value of this constant is 1580
   * </p>
   */
  visCmdFileNewStencilDlg(1580),
  /**
   * <p>
   * The value of this constant is 1582
   * </p>
   */
  visCmdFileNewBlankStencil(1582),
  /**
   * <p>
   * The value of this constant is 1583
   * </p>
   */
  visCmdFileChooseTemplates(1583),
  /**
   * <p>
   * The value of this constant is 1584
   * </p>
   */
  visCmdProgRefHelp(1584),
  /**
   * <p>
   * The value of this constant is 1585
   * </p>
   */
  visCmdInsertHyperLink(1585),
  /**
   * <p>
   * The value of this constant is 1586
   * </p>
   */
  visCmdHelpTemplates(1586),
  /**
   * <p>
   * The value of this constant is 1588
   * </p>
   */
  visCmdEmailRouting(1588),
  /**
   * <p>
   * The value of this constant is 1589
   * </p>
   */
  visCmdSendToExchange(1589),
  /**
   * <p>
   * Removes VBA project from active document. Use when VBA is disabled - with caution.
   * </p>
   * <p>
   * The value of this constant is 1590
   * </p>
   */
  visCmdRemoveVBAFromActiveDoc(1590),
  /**
   * <p>
   * The value of this constant is 1595
   * </p>
   */
  visCmdINETUserSearchPage(1595),
  /**
   * <p>
   * The value of this constant is 1596
   * </p>
   */
  visCmdINETVisioHomePage(1596),
  /**
   * <p>
   * The value of this constant is 1598
   * </p>
   */
  visCmdINETGoForward(1598),
  /**
   * <p>
   * The value of this constant is 1599
   * </p>
   */
  visCmdINETGoBack(1599),
  /**
   * <p>
   * The value of this constant is 1601
   * </p>
   */
  visCmdOpenActiveObject(1601),
  /**
   * <p>
   * The value of this constant is 1602
   * </p>
   */
  visCmdCancelInPlaceEditing(1602),
  /**
   * <p>
   * The value of this constant is 1604
   * </p>
   */
  visCmdINETVisioSolutionsLibrary(1604),
  /**
   * <p>
   * The value of this constant is 1605
   * </p>
   */
  visCmdINETKnowledgeBase(1605),
  /**
   * <p>
   * The value of this constant is 1606
   * </p>
   */
  visCmdINETDiagrammingResources(1606),
  /**
   * <p>
   * The value of this constant is 1607
   * </p>
   */
  visCmdINETOpenHlink(1607),
  /**
   * <p>
   * The value of this constant is 1608
   * </p>
   */
  visCmdINETOpenHlinkNewWnd(1608),
  /**
   * <p>
   * The value of this constant is 1609
   * </p>
   */
  visCmdINETDeleteHlink(1609),
  /**
   * <p>
   * The value of this constant is 1610
   * </p>
   */
  visCmdINETCopyHyperlink(1610),
  /**
   * <p>
   * The value of this constant is 1611
   * </p>
   */
  visCmdHyperlinkHier(1611),
  /**
   * <p>
   * The value of this constant is 1619
   * </p>
   */
  visCmdINETEditHyperlink(1619),
  /**
   * <p>
   * The value of this constant is 1620
   * </p>
   */
  visCmdINETPasteAsHyperlink(1620),
  /**
   * <p>
   * The value of this constant is 1633
   * </p>
   */
  visCmdBullets(1633),
  /**
   * <p>
   * The value of this constant is 1634
   * </p>
   */
  visCmdShapeLayerToolbar(1634),
  /**
   * <p>
   * The value of this constant is 1635
   * </p>
   */
  visCmdGoToPageToolbar(1635),
  /**
   * <p>
   * The value of this constant is 1642
   * </p>
   */
  visCmdFormatAllTextProps(1642),
  /**
   * <p>
   * The value of this constant is 1645
   * </p>
   */
  visCmdBrowseSampleDrawings(1645),
  /**
   * <p>
   * The value of this constant is 1646
   * </p>
   */
  visCmdMSOInsertEquation(1646),
  /**
   * <p>
   * The value of this constant is 1650
   * </p>
   */
  visCmdABarHide(1650),
  /**
   * <p>
   * The value of this constant is 1651
   * </p>
   */
  visCmdABarToggleFloat(1651),
  /**
   * <p>
   * The value of this constant is 1652
   * </p>
   */
  visCmdABarAutohide(1652),
  /**
   * <p>
   * The value of this constant is 1653
   * </p>
   */
  visCmdPanZoom(1653),
  /**
   * <p>
   * The value of this constant is 1654
   * </p>
   */
  visCmdPagesList(1654),
  /**
   * <p>
   * The value of this constant is 1658
   * </p>
   */
  visCmdCustProp(1658),
  /**
   * <p>
   * The value of this constant is 1661
   * </p>
   */
  visCmdInkTool(1661),
  /**
   * <p>
   * The value of this constant is 1664
   * </p>
   */
  visCmdInkCustomizePen(1664),
  /**
   * <p>
   * The value of this constant is 1669
   * </p>
   */
  visCmdShapesWindow(1669),
  /**
   * <p>
   * The value of this constant is 1670
   * </p>
   */
  visCmdSizePos(1670),
  /**
   * <p>
   * The value of this constant is 1671
   * </p>
   */
  visCmdFileNewBlankDrawingMetric(1671),
  /**
   * <p>
   * The value of this constant is 1672
   * </p>
   */
  visCmdFileNewBlankDrawingUS(1672),
  /**
   * <p>
   * The value of this constant is 1673
   * </p>
   */
  visCmdFileNewBlankStencilMetric(1673),
  /**
   * <p>
   * The value of this constant is 1674
   * </p>
   */
  visCmdFileNewBlankStencilUS(1674),
  /**
   * <p>
   * The value of this constant is 1675
   * </p>
   */
  visCmdCustomPropertySets(1675),
  /**
   * <p>
   * The value of this constant is 1676
   * </p>
   */
  visCmdStenSave(1676),
  /**
   * <p>
   * The value of this constant is 1677
   * </p>
   */
  visCmdStenSaveAs(1677),
  /**
   * <p>
   * The value of this constant is 1678
   * </p>
   */
  visCmdStenProperties(1678),
  /**
   * <p>
   * The value of this constant is 1679
   * </p>
   */
  visCmdStenEditToggle(1679),
  /**
   * <p>
   * The value of this constant is 1680
   * </p>
   */
  visCmdStenEditOn(1680),
  /**
   * <p>
   * The value of this constant is 1681
   * </p>
   */
  visCmdStenEditOff(1681),
  /**
   * <p>
   * The value of this constant is 1682
   * </p>
   */
  visCmdEditUndoMultiple(1682),
  /**
   * <p>
   * The value of this constant is 1683
   * </p>
   */
  visCmdEditRedoMultiple(1683),
  /**
   * <p>
   * The value of this constant is 1684
   * </p>
   */
  visCmdABarAutoHeight(1684),
  /**
   * <p>
   * The value of this constant is 1685
   * </p>
   */
  visCmdShapeCommentDlg(1685),
  /**
   * <p>
   * The value of this constant is 1686
   * </p>
   */
  visCmdShapeComment(1686),
  /**
   * <p>
   * The value of this constant is 1687
   * </p>
   */
  visCmdFormatCustPropDef(1687),
  /**
   * <p>
   * The value of this constant is 1688
   * </p>
   */
  visCmdShapeCommentDelete(1688),
  /**
   * <p>
   * The value of this constant is 1689
   * </p>
   */
  visCmdHideDocumentStencil(1689),
  /**
   * <p>
   * The value of this constant is 1690
   * </p>
   */
  visCmdToggleDocumentStencil(1690),
  /**
   * <p>
   * The value of this constant is 1695
   * </p>
   */
  visCmdCustPropDefine(1695),
  /**
   * <p>
   * The value of this constant is 1696
   * </p>
   */
  visCmdSetDynConnRerouteFreely(1696),
  /**
   * <p>
   * The value of this constant is 1697
   * </p>
   */
  visCmdSetDynConnRerouteAsNeeded(1697),
  /**
   * <p>
   * The value of this constant is 1698
   * </p>
   */
  visCmdSetDynConnRerouteNever(1698),
  /**
   * <p>
   * The value of this constant is 1699
   * </p>
   */
  visCmdSetPagePlow(1699),
  /**
   * <p>
   * The value of this constant is 1700
   * </p>
   */
  visCmdSetDynConnRoutingStyle(1700),
  /**
   * <p>
   * The value of this constant is 1702
   * </p>
   */
  visCmdSetPlaceableShapeBehavior(1702),
  /**
   * <p>
   * The value of this constant is 1703
   * </p>
   */
  visCmdSetPageLineJumpCode_Disp(1703),
  /**
   * <p>
   * The value of this constant is 1704
   * </p>
   */
  visCmdSetPageLineJumpCode_None(1704),
  /**
   * <p>
   * The value of this constant is 1705
   * </p>
   */
  visCmdSetPageLineJumpCode_Horz(1705),
  /**
   * <p>
   * The value of this constant is 1706
   * </p>
   */
  visCmdSetPageLineJumpCode_Vert(1706),
  /**
   * <p>
   * The value of this constant is 1707
   * </p>
   */
  visCmdSetPageLineJumpCode_Last(1707),
  /**
   * <p>
   * The value of this constant is 1708
   * </p>
   */
  visCmdSetDynConnLineJumpStyle_Page(1708),
  /**
   * <p>
   * The value of this constant is 1709
   * </p>
   */
  visCmdSetDynConnLineJumpStyle_Arc(1709),
  /**
   * <p>
   * The value of this constant is 1710
   * </p>
   */
  visCmdSetDynConnLineJumpStyle_Gap(1710),
  /**
   * <p>
   * The value of this constant is 1711
   * </p>
   */
  visCmdSetDynConnLineJumpStyle_Square(1711),
  /**
   * <p>
   * The value of this constant is 1712
   * </p>
   */
  visCmdSetDynConnLineJumpStyle_Triangle(1712),
  /**
   * <p>
   * The value of this constant is 1713
   * </p>
   */
  visCmdSetDynConnLineJumpStyle_2pt(1713),
  /**
   * <p>
   * The value of this constant is 1714
   * </p>
   */
  visCmdSetDynConnLineJumpStyle_3pt(1714),
  /**
   * <p>
   * The value of this constant is 1715
   * </p>
   */
  visCmdSetDynConnLineJumpStyle_4pt(1715),
  /**
   * <p>
   * The value of this constant is 1716
   * </p>
   */
  visCmdSetDynConnLineJumpStyle_5pt(1716),
  /**
   * <p>
   * The value of this constant is 1717
   * </p>
   */
  visCmdSetDynConnLineJumpStyle_6pt(1717),
  /**
   * <p>
   * The value of this constant is 1718
   * </p>
   */
  visCmdSWExpandRow(1718),
  /**
   * <p>
   * The value of this constant is 1719
   * </p>
   */
  visCmdHyperlinkList(1719),
  /**
   * <p>
   * The value of this constant is 1720
   * </p>
   */
  visCmdHeaderFooter(1720),
  /**
   * <p>
   * The value of this constant is 1721
   * </p>
   */
  visCmdDrawingExplorer(1721),
  /**
   * <p>
   * The value of this constant is 1726
   * </p>
   */
  visCmdHideAllToolbars(1726),
  /**
   * <p>
   * The value of this constant is 1741
   * </p>
   */
  visCmdTextStrikethrough(1741),
  /**
   * <p>
   * The value of this constant is 1742
   * </p>
   */
  visCmdDrawRegion(1742),
  /**
   * <p>
   * The value of this constant is 1744
   * </p>
   */
  visCmdSetAddMarkup(1744),
  /**
   * <p>
   * The value of this constant is 1765
   * </p>
   */
  visCmdDynamicGrid(1765),
  /**
   * <p>
   * The value of this constant is 1766
   * </p>
   */
  visCmdRulSub(1766),
  /**
   * <p>
   * The value of this constant is 1767
   * </p>
   */
  visCmdGrid(1767),
  /**
   * <p>
   * The value of this constant is 1768
   * </p>
   */
  visCmdAlignBox(1768),
  /**
   * <p>
   * The value of this constant is 1769
   * </p>
   */
  visCmdShapeGeo(1769),
  /**
   * <p>
   * The value of this constant is 1771
   * </p>
   */
  visCmdGuides(1771),
  /**
   * <p>
   * The value of this constant is 1772
   * </p>
   */
  visCmdShapeHand(1772),
  /**
   * <p>
   * The value of this constant is 1773
   * </p>
   */
  visCmdShapeVert(1773),
  /**
   * <p>
   * The value of this constant is 1774
   * </p>
   */
  visCmdConnPoints(1774),
  /**
   * <p>
   * The value of this constant is 1775
   * </p>
   */
  visCmdRecordNewMacro(1775),
  /**
   * <p>
   * The value of this constant is 1776
   * </p>
   */
  visCmdStartRecordingMacro(1776),
  /**
   * <p>
   * The value of this constant is 1777
   * </p>
   */
  visCmdStopRecordingMacro(1777),
  /**
   * <p>
   * The value of this constant is 1778
   * </p>
   */
  visCmdPauseRecordingMacro(1778),
  /**
   * <p>
   * The value of this constant is 1779
   * </p>
   */
  visCmdResumeRecordingMacro(1779),
  /**
   * <p>
   * The value of this constant is 1781
   * </p>
   */
  visCmdSSWindowShowTraceWindow(1781),
  /**
   * <p>
   * The value of this constant is 1785
   * </p>
   */
  visCmdFileSaveAsWebPage(1785),
  /**
   * <p>
   * The value of this constant is 1787
   * </p>
   */
  visCmdFileCheckIn(1787),
  /**
   * <p>
   * The value of this constant is 1788
   * </p>
   */
  visCmdFileCheckOut(1788),
  /**
   * <p>
   * The value of this constant is 1790
   * </p>
   */
  visCmdPasteShortcut(1790),
  /**
   * <p>
   * The value of this constant is 1791
   * </p>
   */
  visCmdCreateShortcut(1791),
  /**
   * <p>
   * The value of this constant is 1795
   * </p>
   */
  visCmdReOrderPage(1795),
  /**
   * <p>
   * The value of this constant is 1796
   * </p>
   */
  visCmdStenDrawingExplorer(1796),
  /**
   * <p>
   * The value of this constant is 1802
   * </p>
   */
  visCmdINETOfficeOnTheWeb(1802),
  /**
   * <p>
   * The value of this constant is 1807
   * </p>
   */
  visCmdToolSnapLines(1807),
  /**
   * <p>
   * The value of this constant is 1809
   * </p>
   */
  visCmdHelpSearch(1809),
  /**
   * <p>
   * The value of this constant is 1810
   * </p>
   */
  visCmdTextEditRuler(1810),
  /**
   * <p>
   * The value of this constant is 1812
   * </p>
   */
  visCmdCreateNewDrawing(1812),
  /**
   * <p>
   * The value of this constant is 1822
   * </p>
   */
  visCmdHelpShapeBasics(1822),
  /**
   * <p>
   * The value of this constant is 1829
   * </p>
   */
  visCmdDynConnReroute(1829),
  /**
   * <p>
   * The value of this constant is 1830
   * </p>
   */
  visCmdShapeIntersect(1830),
  /**
   * <p>
   * The value of this constant is 1831
   * </p>
   */
  visCmdINETVisioOnTheWeb(1831),
  /**
   * <p>
   * The value of this constant is 1836
   * </p>
   */
  visCmdReviewerVisibilityAll(1836),
  /**
   * <p>
   * The value of this constant is 1837
   * </p>
   */
  visCmdSetDynConnRerouteOnCrossover(1837),
  /**
   * <p>
   * The value of this constant is 1857
   * </p>
   */
  visCmdSaveForAutoRecover(1857),
  /**
   * <p>
   * The value of this constant is 1858
   * </p>
   */
  visCmdSetHeaderFooter(1858),
  /**
   * <p>
   * The value of this constant is 1859
   * </p>
   */
  visCmdMsoClipboard(1859),
  /**
   * <p>
   * The value of this constant is 1860
   * </p>
   */
  visCmdMsoSearch(1860),
  /**
   * <p>
   * The value of this constant is 1862
   * </p>
   */
  visCmdTextAllCaps(1862),
  /**
   * <p>
   * The value of this constant is 1863
   * </p>
   */
  visCmdTextDoubleUline(1863),
  /**
   * <p>
   * The value of this constant is 1864
   * </p>
   */
  visCmdAppMaximize(1864),
  /**
   * <p>
   * The value of this constant is 1865
   * </p>
   */
  visCmdAppMinimize(1865),
  /**
   * <p>
   * The value of this constant is 1866
   * </p>
   */
  visCmdMsoAutoCorrectDlg(1866),
  /**
   * <p>
   * The value of this constant is 1867
   * </p>
   */
  visCmdShapeGalleryAddOn(1867),
  /**
   * <p>
   * The value of this constant is 1868
   * </p>
   */
  visCmdAcquireImages(1868),
  /**
   * <p>
   * The value of this constant is 1869
   * </p>
   */
  visCmdDropManyOnPage(1869),
  /**
   * <p>
   * The value of this constant is 1870
   * </p>
   */
  visCmdObjectSwapEnds(1870),
  /**
   * <p>
   * The value of this constant is 1871
   * </p>
   */
  visCmdSetIndexInStencil(1871),
  /**
   * <p>
   * The value of this constant is 1872
   * </p>
   */
  visCmdMsoAutoCorrect(1872),
  /**
   * <p>
   * The value of this constant is 1873
   * </p>
   */
  visCmdMsoAutoFormat(1873),
  /**
   * <p>
   * The value of this constant is 1874
   * </p>
   */
  visCmdShapeTransparencyDlg(1874),
  /**
   * <p>
   * The value of this constant is 1875
   * </p>
   */
  visCmdShapeTransparency(1875),
  /**
   * <p>
   * The value of this constant is 1876
   * </p>
   */
  visCmdToolsShowAddins(1876),
  /**
   * <p>
   * The value of this constant is 1877
   * </p>
   */
  visCmdLicenseVerification(1877),
  /**
   * <p>
   * The value of this constant is 1878
   * </p>
   */
  visCmdRightDragMove(1878),
  /**
   * <p>
   * The value of this constant is 1879
   * </p>
   */
  visCmdRightDragCopy(1879),
  /**
   * <p>
   * The value of this constant is 1880
   * </p>
   */
  visCmdRightDragLink(1880),
  /**
   * <p>
   * The value of this constant is 1881
   * </p>
   */
  visCmdRightDragCancel(1881),
  /**
   * <p>
   * The value of this constant is 1882
   * </p>
   */
  visCmdNMMeetNow(1882),
  /**
   * <p>
   * The value of this constant is 1883
   * </p>
   */
  visCmdImagePropertiesDlg(1883),
  /**
   * <p>
   * The value of this constant is 1884
   * </p>
   */
  visCmdToolsSecurity(1884),
  /**
   * <p>
   * The value of this constant is 1885
   * </p>
   */
  visCmdMsoMediaGallery(1885),
  /**
   * <p>
   * The value of this constant is 1886
   * </p>
   */
  visCmdNextWindow(1886),
  /**
   * <p>
   * The value of this constant is 1887
   * </p>
   */
  visCmdImageProperties(1887),
  /**
   * <p>
   * The value of this constant is 1888
   * </p>
   */
  visCmdSetLanguageDlg(1888),
  /**
   * <p>
   * The value of this constant is 1889
   * </p>
   */
  visCmdSpellingChange(1889),
  /**
   * <p>
   * The value of this constant is 1890
   * </p>
   */
  visCmdDetectAndRepair(1890),
  /**
   * <p>
   * The value of this constant is 1891
   * </p>
   */
  visCmdExportDatabaseAddOn(1891),
  /**
   * <p>
   * The value of this constant is 1892
   * </p>
   */
  visCmdStenIconAndDetail(1892),
  /**
   * <p>
   * The value of this constant is 1893
   * </p>
   */
  visCmdSetDynConnAppearanceDefault(1893),
  /**
   * <p>
   * The value of this constant is 1894
   * </p>
   */
  visCmdSetDynConnAppearanceStraight(1894),
  /**
   * <p>
   * The value of this constant is 1895
   * </p>
   */
  visCmdSetDynConnAppearanceCurved(1895),
  /**
   * <p>
   * Superseded by visCmdTaskPane.
   * </p>
   * <p>
   * The value of this constant is 1896
   * </p>
   */
  visCmdTaskPaneToggle(1896),
  /**
   * <p>
   * The value of this constant is 1897
   * </p>
   */
  visCmdNewFromExisting(1897),
  /**
   * <p>
   * The value of this constant is 1898
   * </p>
   */
  visCmdMsoCustomItem(1898),
  /**
   * <p>
   * The value of this constant is 1899
   * </p>
   */
  visCmdCreateEditMaster(1899),
  /**
   * <p>
   * The value of this constant is 1900
   * </p>
   */
  visCmdBreakOLELink(1900),
  /**
   * <p>
   * The value of this constant is 1901
   * </p>
   */
  visCmdMDIMaximize(1901),
  /**
   * <p>
   * The value of this constant is 1902
   * </p>
   */
  visCmdMDIMinimize(1902),
  /**
   * <p>
   * The value of this constant is 1903
   * </p>
   */
  visCmdMDIRestore(1903),
  /**
   * <p>
   * The value of this constant is 1904
   * </p>
   */
  visCmdAppRestore(1904),
  /**
   * <p>
   * The value of this constant is 1905
   * </p>
   */
  visCmdDeleteBackWord(1905),
  /**
   * <p>
   * The value of this constant is 1906
   * </p>
   */
  visCmdNewDefDocBlankDrawing(1906),
  /**
   * <p>
   * The value of this constant is 1907
   * </p>
   */
  visCmdSelectionModeRect(1907),
  /**
   * <p>
   * The value of this constant is 1908
   * </p>
   */
  visCmdSelectionModeLasso(1908),
  /**
   * <p>
   * The value of this constant is 1909
   * </p>
   */
  visCmdSelectionModeExtend(1909),
  /**
   * <p>
   * The value of this constant is 1914
   * </p>
   */
  visCmdNextMarkup(1914),
  /**
   * <p>
   * The value of this constant is 1915
   * </p>
   */
  visCmdPreviousMarkup(1915),
  /**
   * <p>
   * The value of this constant is 1916
   * </p>
   */
  visCmdMasterExplorer(1916),
  /**
   * <p>
   * The value of this constant is 1917
   * </p>
   */
  visCmdZoomInIgnoreSel(1917),
  /**
   * <p>
   * The value of this constant is 1918
   * </p>
   */
  visCmdZoomOutIgnoreSel(1918),
  /**
   * <p>
   * The value of this constant is 1919
   * </p>
   */
  visCmdReviewerVisibilityNone(1919),
  /**
   * <p>
   * The value of this constant is 1920
   * </p>
   */
  visCmdDeleteComment(1920),
  /**
   * <p>
   * The value of this constant is 1925
   * </p>
   */
  visCmdSizeObjects(1925),
  /**
   * <p>
   * Superseded by visCmdTaskPaneReviewer.
   * </p>
   * <p>
   * The value of this constant is 1939
   * </p>
   */
  visCmdReviewerPaneToggle(1939),
  /**
   * <p>
   * The value of this constant is 1943
   * </p>
   */
  visCmdConnectorEffectRightAngle(1943),
  /**
   * <p>
   * The value of this constant is 1944
   * </p>
   */
  visCmdConnectorEffectStraight(1944),
  /**
   * <p>
   * The value of this constant is 1945
   * </p>
   */
  visCmdConnectorEffectCurved(1945),
  /**
   * <p>
   * The value of this constant is 1946
   * </p>
   */
  visCmdDrawingTools(1946),
  /**
   * <p>
   * The value of this constant is 1951
   * </p>
   */
  visCmdTextDoubleStrikethrough(1951),
  /**
   * <p>
   * The value of this constant is 1952
   * </p>
   */
  visCmdTextHAlignDistribute(1952),
  /**
   * <p>
   * The value of this constant is 1955
   * </p>
   */
  visCmdFormatInkDlg(1955),
  /**
   * <p>
   * The value of this constant is 1962
   * </p>
   */
  visCmdCheckForUpdates(1962),
  /**
   * <p>
   * The value of this constant is 1963
   * </p>
   */
  visCmdPrivacySettings(1963),
  /**
   * <p>
   * The value of this constant is 1964
   * </p>
   */
  visCmdContactUs(1964),
  /**
   * <p>
   * The value of this constant is 1967
   * </p>
   */
  visCmdResearchLookUp(1967),
  /**
   * <p>
   * The value of this constant is 1968
   * </p>
   */
  visCmdResearchTranslate(1968),
  /**
   * <p>
   * Superseded by visCmdTaskPaneResearch.
   * </p>
   * <p>
   * The value of this constant is 1969
   * </p>
   */
  visCmdResearchPaneToggle(1969),
  /**
   * <p>
   * The value of this constant is 1970
   * </p>
   */
  visCmdInkEraser(1970),
  /**
   * <p>
   * The value of this constant is 1971
   * </p>
   */
  visCmdInkReviewPen(1971),
  /**
   * <p>
   * Superseded by visCmdTaskPaneDocumentManagement.
   * </p>
   * <p>
   * The value of this constant is 1972
   * </p>
   */
  visCmdSharedWorkspacePaneToggle(1972),
  /**
   * <p>
   * The value of this constant is 1973
   * </p>
   */
  visCmdInkStockPen0(1973),
  /**
   * <p>
   * The value of this constant is 1974
   * </p>
   */
  visCmdInkStockPen1(1974),
  /**
   * <p>
   * The value of this constant is 1975
   * </p>
   */
  visCmdInkStockPen2(1975),
  /**
   * <p>
   * The value of this constant is 1976
   * </p>
   */
  visCmdInkStockPen3(1976),
  /**
   * <p>
   * The value of this constant is 1977
   * </p>
   */
  visCmdInkStockPen4(1977),
  /**
   * <p>
   * The value of this constant is 1982
   * </p>
   */
  visCmdDiagramGallery(1982),
  /**
   * <p>
   * The value of this constant is 1985
   * </p>
   */
  visCmdShapeStudioAddon(1985),
  /**
   * <p>
   * The value of this constant is 1997
   * </p>
   */
  visCmdLinkRowToShape(1997),
  /**
   * <p>
   * The value of this constant is 1998
   * </p>
   */
  visCmdAddDataRecordset(1998),
  /**
   * <p>
   * The value of this constant is 1999
   * </p>
   */
  visCmdDeleteDataRecordset(1999),
  /**
   * <p>
   * The value of this constant is 2005
   * </p>
   */
  visCmdStenNamesUnderIcons(2005),
  /**
   * <p>
   * The value of this constant is 2006
   * </p>
   */
  visCmdInsertTextBox(2006),
  /**
   * <p>
   * The value of this constant is 2007
   * </p>
   */
  visCmdInsertVertTextBox(2007),
  /**
   * <p>
   * The value of this constant is 2009
   * </p>
   */
  visCmdRHI(2009),
  /**
   * <p>
   * The value of this constant is 2010
   * </p>
   */
  visCmdRHIDlg(2010),
  /**
   * <p>
   * The value of this constant is 2011
   * </p>
   */
  visCmdDataSelectorDlg(2011),
  /**
   * <p>
   * The value of this constant is 2012
   * </p>
   */
  visCmdViewDirectionToggle(2012),
  /**
   * <p>
   * The value of this constant is 2013
   * </p>
   */
  visCmdViewLeftToRight(2013),
  /**
   * <p>
   * The value of this constant is 2014
   * </p>
   */
  visCmdViewRightToLeft(2014),
  /**
   * <p>
   * The value of this constant is 2017
   * </p>
   */
  visCmdApplyDataGraphic(2017),
  /**
   * <p>
   * The value of this constant is 2019
   * </p>
   */
  visCmdDataRefreshDlg(2019),
  /**
   * <p>
   * The value of this constant is 2021
   * </p>
   */
  visCmdDataRefresh(2021),
  /**
   * <p>
   * The value of this constant is 2022
   * </p>
   */
  visCmdDataRefreshConfigDlg(2022),
  /**
   * <p>
   * The value of this constant is 2024
   * </p>
   */
  visCmdTaskPaneDataGraphic(2024),
  /**
   * <p>
   * The value of this constant is 2037
   * </p>
   */
  visCmdDataRecordsetSetCommand(2037),
  /**
   * <p>
   * The value of this constant is 2038
   * </p>
   */
  visCmdDataRecordsetSetPrimaryKey(2038),
  /**
   * <p>
   * The value of this constant is 2042
   * </p>
   */
  visCmdSpellingOptionsDlg(2042),
  /**
   * <p>
   * The value of this constant is 2043
   * </p>
   */
  visCmdDataColumnSettingsDlg(2043),
  /**
   * <p>
   * The value of this constant is 2044
   * </p>
   */
  visCmdDataExplorerWindow(2044),
  /**
   * <p>
   * The value of this constant is 2045
   * </p>
   */
  visCmdDataAutoLinkWiz(2045),
  /**
   * <p>
   * The value of this constant is 2046
   * </p>
   */
  visCmdDataAutoLink(2046),
  /**
   * <p>
   * The value of this constant is 2047
   * </p>
   */
  visCmdApplyThemeToPage(2047),
  /**
   * <p>
   * The value of this constant is 2048
   * </p>
   */
  visCmdApplyThemeToDoc(2048),
  /**
   * <p>
   * The value of this constant is 2049
   * </p>
   */
  visCmdEditTheme(2049),
  /**
   * <p>
   * The value of this constant is 2050
   * </p>
   */
  visCmdDuplicateTheme(2050),
  /**
   * <p>
   * The value of this constant is 2051
   * </p>
   */
  visCmdReplaceShape(2051),
  /**
   * <p>
   * The value of this constant is 2052
   * </p>
   */
  visCmdDeleteTheme(2052),
  /**
   * <p>
   * The value of this constant is 2053
   * </p>
   */
  visCmdTaskTogglePreviewSize(2053),
  /**
   * <p>
   * The value of this constant is 2054
   * </p>
   */
  visCmdTaskPaneThemeColors(2054),
  /**
   * <p>
   * The value of this constant is 2055
   * </p>
   */
  visCmdTaskPaneThemeEffects(2055),
  /**
   * <p>
   * The value of this constant is 2056
   * </p>
   */
  visCmdAllowThemes(2056),
  /**
   * <p>
   * The value of this constant is 2057
   * </p>
   */
  visCmdDataUnlinkShape(2057),
  /**
   * <p>
   * The value of this constant is 2058
   * </p>
   */
  visCmdDataUnlinkRow(2058),
  /**
   * <p>
   * The value of this constant is 2061
   * </p>
   */
  visCmdUpdateColumnsInLinkedShapes(2061),
  /**
   * <p>
   * The value of this constant is 2064
   * </p>
   */
  visCmdNewThemeEffects(2064),
  /**
   * <p>
   * The value of this constant is 2065
   * </p>
   */
  visCmdNewThemeColors(2065),
  /**
   * <p>
   * The value of this constant is 2067
   * </p>
   */
  visCmdDeleteDataGraphic(2067),
  /**
   * <p>
   * The value of this constant is 2068
   * </p>
   */
  visCmdRelayoutShapes(2068),
  /**
   * <p>
   * The value of this constant is 2072
   * </p>
   */
  visCmdDataRecordsetProperties(2072),
  /**
   * <p>
   * The value of this constant is 2091
   * </p>
   */
  visCmdAutoConnectToggle(2091),
  /**
   * <p>
   * The value of this constant is 2092
   * </p>
   */
  visCmdApplyDataGraphicAfterLink(2092),
  /**
   * <p>
   * The value of this constant is 2094
   * </p>
   */
  visCmdDataRefreshAddConflict(2094),
  /**
   * <p>
   * The value of this constant is 2095
   * </p>
   */
  visCmdDataRefreshDeleteConflict(2095),
  /**
   * <p>
   * The value of this constant is 2098
   * </p>
   */
  visCmdDataAutoConnect(2098),
  /**
   * <p>
   * The value of this constant is 2103
   * </p>
   */
  visCmdDataRefreshResolveConflict(2103),
  /**
   * <p>
   * The value of this constant is 2104
   * </p>
   */
  visCmdTrustCenterDlg(2104),
  /**
   * <p>
   * The value of this constant is 2105
   * </p>
   */
  visCmdAutoGenerateDataGraphics(2105),
  /**
   * <p>
   * The value of this constant is 2106
   * </p>
   */
  visCmdDuplicateDataGraphic(2106),
  /**
   * <p>
   * The value of this constant is 2107
   * </p>
   */
  visCmdRemoveDataGraphicFromSel(2107),
  /**
   * <p>
   * The value of this constant is 2108
   * </p>
   */
  visCmdDropManyLinked(2108),
  /**
   * <p>
   * The value of this constant is 2109
   * </p>
   */
  visCmdFileUndoCheckout(2109),
  /**
   * <p>
   * The value of this constant is 2114
   * </p>
   */
  visCmdDeleteForwardWord(2114),
  /**
   * <p>
   * The value of this constant is 2117
   * </p>
   */
  visCmdSaveAsFixedFormatDlg(2117),
  /**
   * <p>
   * The value of this constant is 2119
   * </p>
   */
  visCmdRemoveThemeFromSel(2119),
  /**
   * <p>
   * The value of this constant is 1896
   * </p>
   */
  visCmdTaskPane(1896),
  /**
   * <p>
   * The value of this constant is 1939
   * </p>
   */
  visCmdTaskPaneReviewer(1939),
  /**
   * <p>
   * The value of this constant is 1969
   * </p>
   */
  visCmdTaskPaneResearch(1969),
  /**
   * <p>
   * The value of this constant is 1972
   * </p>
   */
  visCmdTaskPaneDocumentManagement(1972),
  /**
   * <p>
   * The value of this constant is 1890
   * </p>
   */
  visCmdOfficeDiagnostics(1890),
  /**
   * <p>
   * The value of this constant is 2127
   * </p>
   */
  visCmdFileLastFile10(2127),
  /**
   * <p>
   * The value of this constant is 2128
   * </p>
   */
  visCmdFileLastFile11(2128),
  /**
   * <p>
   * The value of this constant is 2129
   * </p>
   */
  visCmdFileLastFile12(2129),
  /**
   * <p>
   * The value of this constant is 2130
   * </p>
   */
  visCmdFileLastFile13(2130),
  /**
   * <p>
   * The value of this constant is 2131
   * </p>
   */
  visCmdFileLastFile14(2131),
  /**
   * <p>
   * The value of this constant is 2132
   * </p>
   */
  visCmdFileLastFile15(2132),
  /**
   * <p>
   * The value of this constant is 2133
   * </p>
   */
  visCmdFileLastFile16(2133),
  /**
   * <p>
   * The value of this constant is 2134
   * </p>
   */
  visCmdFileLastFile17(2134),
  /**
   * <p>
   * The value of this constant is 2135
   * </p>
   */
  visCmdFileLastFile18(2135),
  /**
   * <p>
   * The value of this constant is 2136
   * </p>
   */
  visCmdFileLastFile19(2136),
  /**
   * <p>
   * The value of this constant is 2137
   * </p>
   */
  visCmdFileLastFile20(2137),
  /**
   * <p>
   * The value of this constant is 2141
   * </p>
   */
  visCmdOfficeCenterOptions(2141),
  /**
   * <p>
   * The value of this constant is 2144
   * </p>
   */
  visCmdInsertLabelControl(2144),
  /**
   * <p>
   * The value of this constant is 2145
   * </p>
   */
  visCmdInserTextBoxControl(2145),
  /**
   * <p>
   * The value of this constant is 2146
   * </p>
   */
  visCmdInsertSpinControl(2146),
  /**
   * <p>
   * The value of this constant is 2147
   * </p>
   */
  visCmdInsertPushButtonControl(2147),
  /**
   * <p>
   * The value of this constant is 2148
   * </p>
   */
  visCmdInsertImageControl(2148),
  /**
   * <p>
   * The value of this constant is 2149
   * </p>
   */
  visCmdInsertScrollBarControl(2149),
  /**
   * <p>
   * The value of this constant is 2150
   * </p>
   */
  visCmdInsertCheckBoxControl(2150),
  /**
   * <p>
   * The value of this constant is 2151
   * </p>
   */
  visCmdInsertRadioButtonControl(2151),
  /**
   * <p>
   * The value of this constant is 2152
   * </p>
   */
  visCmdInsertComboBoxControl(2152),
  /**
   * <p>
   * The value of this constant is 2153
   * </p>
   */
  visCmdInsertListBoxControl(2153),
  /**
   * <p>
   * The value of this constant is 2154
   * </p>
   */
  visCmdInsertToggleButtonControl(2154),
  /**
   * <p>
   * The value of this constant is 2165
   * </p>
   */
  visCmdInsertNewBackgroundPage(2165),
  /**
   * <p>
   * The value of this constant is 2167
   * </p>
   */
  visCmdShowShapeSheetShape(2167),
  /**
   * <p>
   * The value of this constant is 2168
   * </p>
   */
  visCmdShowShapeSheetPage(2168),
  /**
   * <p>
   * The value of this constant is 2169
   * </p>
   */
  visCmdShowShapeSheetDocument(2169),
  /**
   * <p>
   * The value of this constant is 2170
   * </p>
   */
  visCmdSetPageOrientation(2170),
  /**
   * <p>
   * The value of this constant is 2171
   * </p>
   */
  visCmdSetPageSize(2171),
  /**
   * <p>
   * The value of this constant is 2172
   * </p>
   */
  visCmdDropAndContain(2172),
  /**
   * <p>
   * The value of this constant is 2173
   * </p>
   */
  visCmdAddMemberToContainer(2173),
  /**
   * <p>
   * The value of this constant is 2174
   * </p>
   */
  visCmdInsertMemberIntoList(2174),
  /**
   * <p>
   * The value of this constant is 2175
   * </p>
   */
  visCmdRemoveMemberFromContainer(2175),
  /**
   * <p>
   * The value of this constant is 2176
   * </p>
   */
  visCmdPageSizeDlg(2176),
  /**
   * <p>
   * The value of this constant is 2178
   * </p>
   */
  visCmdResearchThesaurus(2178),
  /**
   * <p>
   * The value of this constant is 2179
   * </p>
   */
  visCmdPreviousCommentMarkup(2179),
  /**
   * <p>
   * The value of this constant is 2180
   * </p>
   */
  visCmdNextCommentMarkup(2180),
  /**
   * <p>
   * The value of this constant is 2181
   * </p>
   */
  visCmdSetContainerProperties(2181),
  /**
   * <p>
   * The value of this constant is 2182
   * </p>
   */
  visCmdCheckCompatibility(2182),
  /**
   * <p>
   * The value of this constant is 2188
   * </p>
   */
  visCmdApplyThemeColors(2188),
  /**
   * <p>
   * The value of this constant is 2189
   * </p>
   */
  visCmdApplyThemeEffects(2189),
  /**
   * <p>
   * The value of this constant is 2190
   * </p>
   */
  visCmdEditThemeColors(2190),
  /**
   * <p>
   * The value of this constant is 2191
   * </p>
   */
  visCmdEditThemeEffects(2191),
  /**
   * <p>
   * The value of this constant is 2195
   * </p>
   */
  visCmdFitContainerToContents(2195),
  /**
   * <p>
   * The value of this constant is 2196
   * </p>
   */
  visCmdDropAndInsertIntoList(2196),
  /**
   * <p>
   * The value of this constant is 2197
   * </p>
   */
  visCmdReorderList(2197),
  /**
   * <p>
   * The value of this constant is 2199
   * </p>
   */
  visCmdDeleteConnectors(2199),
  /**
   * <p>
   * The value of this constant is 2201
   * </p>
   */
  visCmdMultipleFileImport(2201),
  /**
   * <p>
   * The value of this constant is 2202
   * </p>
   */
  visCmdInsertPageTab(2202),
  /**
   * <p>
   * The value of this constant is 2204
   * </p>
   */
  visCmdDisbandContainer(2204),
  /**
   * <p>
   * The value of this constant is 2205
   * </p>
   */
  visCmdFormatPictureAutobalance(2205),
  /**
   * <p>
   * The value of this constant is 2212
   * </p>
   */
  visCmdFormatPictureCompressionDlg(2212),
  /**
   * <p>
   * The value of this constant is 2213
   * </p>
   */
  visCmdCloseInkToolsRibbonTab(2213),
  /**
   * <p>
   * The value of this constant is 2219
   * </p>
   */
  visCmdSelectContainerMembers(2219),
  /**
   * <p>
   * The value of this constant is 2220
   * </p>
   */
  visCmdLockContainer(2220),
  /**
   * <p>
   * The value of this constant is 2221
   * </p>
   */
  visCmdPasteToLocation(2221),
  /**
   * <p>
   * The value of this constant is 2222
   * </p>
   */
  visCmdAutoAlignAndSpace(2222),
  /**
   * <p>
   * The value of this constant is 2223
   * </p>
   */
  visCmdAutoAlign(2223),
  /**
   * <p>
   * The value of this constant is 2224
   * </p>
   */
  visCmdAutoSpace(2224),
  /**
   * <p>
   * The value of this constant is 2225
   * </p>
   */
  visCmdMoveOffPageBreaks(2225),
  /**
   * <p>
   * The value of this constant is 2226
   * </p>
   */
  visCmdDiagramRotateRight(2226),
  /**
   * <p>
   * The value of this constant is 2227
   * </p>
   */
  visCmdDiagramRotateLeft(2227),
  /**
   * <p>
   * The value of this constant is 2228
   * </p>
   */
  visCmdDiagramFlipVertical(2228),
  /**
   * <p>
   * The value of this constant is 2229
   * </p>
   */
  visCmdDiagramFlipHorizontal(2229),
  /**
   * <p>
   * The value of this constant is 2231
   * </p>
   */
  visCmdShowLineJumpsToggle(2231),
  /**
   * <p>
   * The value of this constant is 2232
   * </p>
   */
  visCmdMinimizeRibbonToggle(2232),
  /**
   * <p>
   * The value of this constant is 2233
   * </p>
   */
  visCmdLayoutSpacingDlg(2233),
  /**
   * <p>
   * The value of this constant is 2238
   * </p>
   */
  visCmdCOMAddinsDlg(2238),
  /**
   * <p>
   * The value of this constant is 2245
   * </p>
   */
  visCmdNewSubProcess(2245),
  /**
   * <p>
   * The value of this constant is 2249
   * </p>
   */
  visCmdCreateSubProcessFromSel(2249),
  /**
   * <p>
   * The value of this constant is 2251
   * </p>
   */
  visCmdAddToAllContainers(2251),
  /**
   * <p>
   * The value of this constant is 2252
   * </p>
   */
  visCmdRemoveFromAllContainers(2252),
  /**
   * <p>
   * The value of this constant is 2253
   * </p>
   */
  visCmdValidateDiagram(2253),
  /**
   * <p>
   * The value of this constant is 2254
   * </p>
   */
  visCmdIgnoreValidationIssue(2254),
  /**
   * <p>
   * The value of this constant is 2255
   * </p>
   */
  visCmdReinstateValidationIssue(2255),
  /**
   * <p>
   * The value of this constant is 2256
   * </p>
   */
  visCmdIgnoreValidationRule(2256),
  /**
   * <p>
   * The value of this constant is 2257
   * </p>
   */
  visCmdStopIgnoringValidationRule(2257),
  /**
   * <p>
   * The value of this constant is 2258
   * </p>
   */
  visCmdShowIgnoredIssuesToggle(2258),
  /**
   * <p>
   * The value of this constant is 2263
   * </p>
   */
  visCmdValidationIssuesWindowToggle(2263),
  /**
   * <p>
   * The value of this constant is 2265
   * </p>
   */
  visCmdSetDiagramServices(2265),
  /**
   * <p>
   * The value of this constant is 2266
   * </p>
   */
  visCmdSetAutoSize(2266),
  /**
   * <p>
   * The value of this constant is 2267
   * </p>
   */
  visCmdAutoSizeDrawing(2267),
  /**
   * <p>
   * The value of this constant is 2268
   * </p>
   */
  visCmdAddToNewContainer(2268),
  /**
   * <p>
   * The value of this constant is 2269
   * </p>
   */
  visCmdCollapseShapesWindow(2269),
  /**
   * <p>
   * The value of this constant is 2270
   * </p>
   */
  visCmdListInsertBefore(2270),
  /**
   * <p>
   * The value of this constant is 2271
   * </p>
   */
  visCmdListInsertAfter(2271),
  /**
   * <p>
   * The value of this constant is 2278
   * </p>
   */
  visCmdValidationIssuesArrangeByRule(2278),
  /**
   * <p>
   * The value of this constant is 2279
   * </p>
   */
  visCmdValidationIssuesArrangeByCategory(2279),
  /**
   * <p>
   * The value of this constant is 2280
   * </p>
   */
  visCmdValidationIssuesArrangeByPage(2280),
  /**
   * <p>
   * The value of this constant is 2281
   * </p>
   */
  visCmdValidationIssuesArrangeByIgnored(2281),
  /**
   * <p>
   * The value of this constant is 2282
   * </p>
   */
  visCmdValidationIssuesArrangeOriginalOrder(2282),
  /**
   * <p>
   * The value of this constant is 2285
   * </p>
   */
  visCmdApplyMainTheme(2285),
  /**
   * <p>
   * The value of this constant is 2286
   * </p>
   */
  visCmdDropCallout(2286),
  /**
   * <p>
   * The value of this constant is 2287
   * </p>
   */
  visCmdAssociateCallout(2287),
  /**
   * <p>
   * The value of this constant is 2289
   * </p>
   */
  visCmdApplyMainThemeToPage(2289),
  /**
   * <p>
   * The value of this constant is 2290
   * </p>
   */
  visCmdActivateQuickShapesWnd(2290),
  /**
   * <p>
   * The value of this constant is 2291
   * </p>
   */
  visCmdHideMoreShapes(2291),
  /**
   * <p>
   * The value of this constant is 2293
   * </p>
   */
  visCmdPublishToVisioServices(2293),
  /**
   * <p>
   * The value of this constant is 2294
   * </p>
   */
  visCmdPublishToProcessRepository(2294),
  /**
   * <p>
   * The value of this constant is 2295
   * </p>
   */
  visCmdEditRedoOrRepeat(2295),
  /**
   * <p>
   * The value of this constant is 2296
   * </p>
   */
  visCmdApplyMainThemeToDocument(2296),
  /**
   * <p>
   * The value of this constant is 2297
   * </p>
   */
  visCmdApplyThemeToNewShapesToggle(2297),
  /**
   * <p>
   * The value of this constant is 2298
   * </p>
   */
  visCmdFileSaveAsDrawingPreviousFileFormat(2298),
  /**
   * <p>
   * The value of this constant is 2299
   * </p>
   */
  visCmdFileSaveAsTemplate(2299),
  /**
   * <p>
   * The value of this constant is 2300
   * </p>
   */
  visCmdFileSaveAsPNG(2300),
  /**
   * <p>
   * The value of this constant is 2301
   * </p>
   */
  visCmdFileSaveAsJPG(2301),
  /**
   * <p>
   * The value of this constant is 2302
   * </p>
   */
  visCmdFileSaveAsEMF(2302),
  /**
   * <p>
   * The value of this constant is 2303
   * </p>
   */
  visCmdFileSaveAsSVG(2303),
  /**
   * <p>
   * The value of this constant is 2304
   * </p>
   */
  visCmdFileSaveAsVDX(2304),
  /**
   * <p>
   * The value of this constant is 2305
   * </p>
   */
  visCmdFileSaveAsDWG(2305),
  /**
   * <p>
   * The value of this constant is 2306
   * </p>
   */
  visCmdFileSaveAsDrawing(2306),
  /**
   * <p>
   * The value of this constant is 2311
   * </p>
   */
  visCmdFileSaveAsMacroDrawing(2311),
  /**
   * <p>
   * The value of this constant is 2326
   * </p>
   */
  visCmdValidationIssueNavigateToShape(2326),
  /**
   * <p>
   * The value of this constant is 2331
   * </p>
   */
  visCmdInsertLegendHorizontal(2331),
  /**
   * <p>
   * The value of this constant is 2332
   * </p>
   */
  visCmdPageSizeToFitDrawing(2332),
  /**
   * <p>
   * The value of this constant is 2333
   * </p>
   */
  visCmdPageAutoSizeToggle(2333),
  /**
   * <p>
   * The value of this constant is 2335
   * </p>
   */
  visCmdInsertLegendVertical1(2335),
  /**
   * <p>
   * The value of this constant is 2337
   * </p>
   */
  visCmdPostDrag(2337),
  /**
   * <p>
   * The value of this constant is 2340
   * </p>
   */
  visCmdSpaceShapesAvoidPageBreaksToggle(2340),
  /**
   * <p>
   * The value of this constant is 2344
   * </p>
   */
  visCmdShapeSearchWindowToggle(2344),
  /**
   * <p>
   * The value of this constant is 2345
   * </p>
   */
  visCmdInsertClipArtDlg(2345),
  /**
   * <p>
   * The value of this constant is 2346
   * </p>
   */
  visCmdRemoveMemberFromList(2346),
  /**
   * <p>
   * The value of this constant is 2352
   * </p>
   */
  visCmdTranslateOptions(2352),
  /**
   * <p>
   * The value of this constant is 2347
   * </p>
   */
  visCmdContainerAutoResizeOff(2347),
  /**
   * <p>
   * The value of this constant is 2348
   * </p>
   */
  visCmdContainerAutoResizeExpandOnly(2348),
  /**
   * <p>
   * The value of this constant is 2349
   * </p>
   */
  visCmdContainerAutoResizeExpandContract(2349),
  /**
   * <p>
   * The value of this constant is 2361
   * </p>
   */
  visCmdNewForegroundPage(2361),
  /**
   * <p>
   * The value of this constant is 2363
   * </p>
   */
  visCmdLanguagePreferencesDlg(2363),
  /**
   * <p>
   * The value of this constant is 2382
   * </p>
   */
  visCmdSetThemeBehavior(2382),
  /**
   * <p>
   * The value of this constant is 2383
   * </p>
   */
  visCmdDuplicatePage(2383),
  /**
   * <p>
   * The value of this constant is 2384
   * </p>
   */
  visCmdUpgradeThemeModel(2384),
  /**
   * <p>
   * The value of this constant is 2385
   * </p>
   */
  visCmdCoauthMerging(2385),
  /**
   * <p>
   * The value of this constant is 2455
   * </p>
   */
  visCmdApplyCalloutForRSField(2455),
  ;

  private  int value;
  tagVisUICmds(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
